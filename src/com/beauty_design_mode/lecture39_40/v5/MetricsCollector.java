package com.beauty_design_mode.lecture39_40.v5;

import com.beauty_design_mode.lecture39_40.support.StringUtils;
import com.beauty_design_mode.lecture39_40.v3.MetricsStorage;
import com.beauty_design_mode.lecture39_40.v3.model.RequestInfo;
import com.beauty_design_mode.lecture39_40.v5.support.AsyncEventBus;
import com.beauty_design_mode.lecture39_40.v5.support.EventBus;
import com.beauty_design_mode.lecture39_40.v5.support.Subscribe;

import java.util.concurrent.Executors;

/**
 * 指标收集器：打点采集原始数据
 * <p>
 * v5: 使用异步优化「非功能性需求」,此处使用 Google EventBus
 *
 * @author Alan Yin
 * @date 2020/10/19
 */

public class MetricsCollector {

    private static final int DEFAULT_STORAGE_THREAD_POOL_SIZE = 20;

    private MetricsStorage metricsStorage;
    private EventBus eventBus;

    public MetricsCollector(MetricsStorage metricsStorage, int threadNumToSaveData) {
        this.metricsStorage = metricsStorage;
        this.eventBus = new AsyncEventBus(Executors.newFixedThreadPool(threadNumToSaveData));
        this.eventBus.register(new EventListener());
    }

    public MetricsCollector(MetricsStorage metricsStorage) {
        this(metricsStorage, DEFAULT_STORAGE_THREAD_POOL_SIZE);
    }

    public void recordRequest(RequestInfo requestInfo) {
        if (requestInfo == null || StringUtils.isBlank(requestInfo.getApiName())) {
            return;
        }
        eventBus.post(requestInfo);
    }

    public class EventListener {
        @Subscribe
        public void saveRequestInfo(RequestInfo requestInfo) {
            metricsStorage.saveRequestInfo(requestInfo);
        }
    }
}
