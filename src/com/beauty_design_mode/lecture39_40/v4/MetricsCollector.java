package com.beauty_design_mode.lecture39_40.v4;


import com.beauty_design_mode.lecture25_26.support.StringUtils;
import com.beauty_design_mode.lecture39_40.v3.MetricsStorage;
import com.beauty_design_mode.lecture39_40.v3.RedisMetricsStorage;
import com.beauty_design_mode.lecture39_40.v3.model.RequestInfo;

/**
 * 指标收集器：打点采集原始数据
 * <p>
 *
 * @author Alan Yin
 * @date 2020/10/19
 */

public class MetricsCollector {

    private MetricsStorage metricsStorage;

    // 兼顾灵活性和代码的可测试性，这个构造函数继续保留
    public MetricsCollector(MetricsStorage metricsStorage) {
        this.metricsStorage = metricsStorage;
    }

    // 兼顾代码的易用性，新增一个封装了默认依赖的构造函数
    public MetricsCollector() {
        this(new RedisMetricsStorage());
    }

    public void recordRequest(RequestInfo requestInfo) {
        if (requestInfo == null || StringUtils.isBlank(requestInfo.getApiName())) {
            return;
        }
        metricsStorage.saveRequestInfo(requestInfo);
    }

}
