package com.beauty_design_mode.lecture39_40.v4;

import com.beauty_design_mode.lecture39_40.v3.Aggregator;
import com.beauty_design_mode.lecture39_40.v3.MetricsStorage;
import com.beauty_design_mode.lecture39_40.v3.StatViewer;
import com.beauty_design_mode.lecture39_40.v3.model.RequestInfo;
import com.beauty_design_mode.lecture39_40.v3.model.RequestStat;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/**
 * v4: 利用继承解决 EmailReporter 和 ConsoleReporter 代码重复的问题
 *
 * @author Alan Yin
 * @date 2020/10/19
 */

public class ScheduledReporter {

    protected MetricsStorage metricsStorage;
    protected Aggregator aggregator;
    protected StatViewer statViewer;

    public ScheduledReporter(MetricsStorage metricsStorage, Aggregator aggregator, StatViewer statViewer) {
        this.metricsStorage = metricsStorage;
        this.aggregator = aggregator;
        this.statViewer = statViewer;
    }

    protected void doStartAndReport(long startTimeInMillis, long endTimeInMillis) {
        long durationInMills = endTimeInMillis = startTimeInMillis;
        Map<String, List<RequestInfo>> requestInfos = metricsStorage.getRequestInfos(startTimeInMillis, endTimeInMillis);
        Map<String, RequestStat> requestStats = aggregator.aggregate(requestInfos, durationInMills);
        statViewer.output(requestStats, startTimeInMillis, endTimeInMillis);
    }
}
