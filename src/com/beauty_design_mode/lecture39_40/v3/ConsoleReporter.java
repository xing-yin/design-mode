package com.beauty_design_mode.lecture39_40.v3;

import com.beauty_design_mode.lecture25_26.support.Gson;
import com.beauty_design_mode.lecture39_40.v3.model.RequestInfo;
import com.beauty_design_mode.lecture39_40.v3.model.RequestStat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 命令行上报
 * <p>
 * v2 版本问题 review 分析:
 * Reporter 和 EmailReporter 中存在代码重复问题。
 * a.在这两个类中，从数据库中取数据、做统计的逻辑都是相同的，可以抽取出来复用，否则就违反了 DRY 原则。
 * b.而且整个类负责的事情比较多，职责不是太单一。特别是显示部分的代码，可能会比较复杂（比如 Email 的展示方式），最好是将显示部分的代码逻辑拆分成独立的类。
 * c.代码中涉及线程操作，并且调用了 Aggregator 的静态函数，所以代码的可测试性不好。
 * <p>
 * v3 重构:
 * 组装类并定时触发执行统计显示。在将核心逻辑剥离出来之后，这个类的代码变得更加简洁、清晰，
 * 只负责组装各个类（MetricsStorage、Aggegrator、StatViewer）来完成整个工作流程。
 *
 * @author Alan Yin
 * @date 2020/10/14
 */

public class ConsoleReporter {

    private MetricsStorage metricsStorage;
    private ScheduledExecutorService executorService;

    private Aggregator aggregator;
    private StatViewer statViewer;

    public ConsoleReporter(MetricsStorage metricsStorage, Aggregator aggregator, StatViewer statViewer) {
        this.metricsStorage = metricsStorage;
        this.aggregator = aggregator;
        this.statViewer = statViewer;
        this.executorService = Executors.newSingleThreadScheduledExecutor();
    }

    public void startRepeatedReport(long periodInSeconds, long durationInSeconds) {
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                // 第1个代码逻辑: 根据给定的时间区间，从数据库中拉取数据
                long durationInMills = durationInSeconds * 1000;
                long endTimeInMills = System.currentTimeMillis();
                long startTimeInMills = endTimeInMills - durationInMills;
                Map<String, List<RequestInfo>> requestInfos = metricsStorage.getRequestInfos(startTimeInMills, endTimeInMills);
                Map<String, RequestStat> requestStats = aggregator.aggregate(requestInfos, durationInMills);
                statViewer.output(requestStats, startTimeInMills, endTimeInMills);
            }
        }, 0, periodInSeconds, TimeUnit.SECONDS);
    }

}
