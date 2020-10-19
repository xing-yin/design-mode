package com.beauty_design_mode.lecture39_40.v4;

import com.beauty_design_mode.lecture39_40.v3.*;
import com.beauty_design_mode.lecture39_40.v3.model.RequestInfo;
import com.beauty_design_mode.lecture39_40.v3.model.RequestStat;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Alan Yin
 * @date 2020/10/19
 */

public class ConsoleReporter extends ScheduledReporter {

    private ScheduledExecutorService executorService;

    public ConsoleReporter(MetricsStorage metricsStorage, Aggregator aggregator, StatViewer statViewer) {
        super(metricsStorage, aggregator, statViewer);
    }

    // 兼顾代码的易用性，新增一个封装了默认依赖的构造函数
    public ConsoleReporter() {
        this(new RedisMetricsStorage(), new Aggregator(), new ConsoleViewer());
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
