package com.beauty_design_mode.lecture39_40.v3;


import com.beauty_design_mode.lecture25_26.support.StringUtils;
import com.beauty_design_mode.lecture39_40.v3.model.RequestInfo;

/**
 * 指标收集器：打点采集原始数据
 * <p>
 * (与v2 相同，设计与实现比较简单，不是 V3 重构的重点)
 *
 * @author Alan Yin
 * @date 2020/10/14
 */

public class MetricsCollector {

    /**
     * 基于接口而非实现编程
     */
    private MetricsStorage metricsStorage;

    public MetricsCollector(MetricsStorage metricsStorage) {
        this.metricsStorage = metricsStorage;
    }

    /**
     * 用一个函数代替了最小原型(V1版本)中的2个函数：recordResponseTime 和 recordTimestamp
     *
     * @param requestInfo
     */
    public void recordRequest(RequestInfo requestInfo) {
        if (requestInfo == null || StringUtils.isBlank(requestInfo.getApiName())) {
            return;
        }
        metricsStorage.saveRequestInfo(requestInfo);
    }

}
