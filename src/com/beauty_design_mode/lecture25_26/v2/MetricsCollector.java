package com.beauty_design_mode.lecture25_26.v2;


import com.beauty_design_mode.lecture25_26.support.StringUtils;
import com.beauty_design_mode.lecture25_26.v2.model.RequestInfo;

/**
 * 指标收集器
 * <p>
 * review 分析:
 * MetricsCollector 负责采集和存储数据，职责相对来说还算比较单一。
 * 它基于接口而非实现编程，通过依赖注入的方式来传递 MetricsStorage 对象，可以在不需要修改代码的情况下，灵活地替换不同的存储方式，满足开闭原则。
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
