package com.beauty_design_mode.lecture25_26.v2;

import com.beauty_design_mode.lecture25_26.support.Gson;
import com.beauty_design_mode.lecture25_26.v2.model.RequestInfo;
import com.beauty_design_mode.lecture25_26.v2.model.RequestStat;
import com.beauty_design_mode.lecture61.demo2.MapReduceSort;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 命令行上报
 * <p>
 * review 分析:
 * Reporter 和 EmailReporter 中存在代码重复问题。在这两个类中，从数据库中取数据、做统计的逻辑都是相同的，可以抽取出来复用，否则就违反了 DRY 原则。
 * 而且整个类负责的事情比较多，职责不是太单一。特别是显示部分的代码，可能会比较复杂（比如 Email 的展示方式），最好是将显示部分的代码逻辑拆分成独立的类。
 * 除此之外，因为代码中涉及线程操作，并且调用了 Aggregator 的静态函数，所以代码的可测试性不好。
 *
 * @author Alan Yin
 * @date 2020/10/14
 */

public class ConsoleReporter {

    private MetricsStorage metricsStorage;

    private ScheduledExecutorService executorService;

    public ConsoleReporter(MetricsStorage metricsStorage) {
        this.metricsStorage = metricsStorage;
        this.executorService = Executors.newSingleThreadScheduledExecutor();
    }

    /**
     * 第4个代码逻辑：定时触发第1、2、3代码逻辑的执行
     *
     * @param periodInSeconds
     * @param durationInSeconds
     */
    public void startRepeatedReport(long periodInSeconds, long durationInSeconds) {
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                // 第1个代码逻辑: 根据给定的时间区间，从数据库中拉取数据
                long durationInMills = durationInSeconds * 1000;
                long endTimeInMills = System.currentTimeMillis();
                long startTimeInMills = endTimeInMills - durationInMills;
                Map<String, List<RequestInfo>> requestInfos = metricsStorage.getRequestInfos(startTimeInMills, endTimeInMills);
                Map<String, RequestStat> stats = new HashMap<>();
                for (Map.Entry<String, List<RequestInfo>> entry : requestInfos.entrySet()) {
                    String apiName = entry.getKey();
                    List<RequestInfo> requestInfosPerApi = entry.getValue();
                    // 第2个代码逻辑：根据原始数据，计算得到统计数据
                    RequestStat requestStat = Aggregator.aggregate(requestInfosPerApi, durationInMills);
                    stats.put(apiName, requestStat);
                }
                // 第3个代码逻辑：将统计数据显示到终端(命令行或邮件)
                System.out.println("Time Span:[" + startTimeInMills + "," + endTimeInMills + "]");
                Gson gson = new Gson();
                System.out.println(gson.toJson2(stats));
            }
        }, 0, periodInSeconds, TimeUnit.SECONDS);
    }

}
