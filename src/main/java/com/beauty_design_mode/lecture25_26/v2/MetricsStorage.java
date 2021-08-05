package com.beauty_design_mode.lecture25_26.v2;

import com.beauty_design_mode.lecture25_26.v2.model.RequestInfo;

import java.util.List;
import java.util.Map;

/**
 * 原始数据的存储和读取
 * <p>
 * review 分析:
 * 所有用到 MetricsStorage 和 RedisMetricsStorage 的地方，都是基于相同的接口函数来编程的，
 * 所以，除了在组装类的地方有所改动（从 RedisMetricsStorage 改为新的存储实现类），其他接口函数调用的地方都不需要改动，满足开闭原则。
 *
 * @author Alan Yin
 * @date 2020/10/14
 */

public interface MetricsStorage {

    void saveRequestInfo(RequestInfo requestInfo);

    List<RequestInfo> getRequestInfos(String apiName, long startTimeInMills, long endTimeInMills);

    Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMills, long endTimeInMills);

}
