package com.beauty_design_mode.lecture39_40.v3;

import com.beauty_design_mode.lecture39_40.v3.model.RequestInfo;

import java.util.List;
import java.util.Map;

/**
 * 原始数据的存储和读取
 * <p>
 * (与v2 相同，设计与实现比较简单，不是 V3 重构的重点)
 *
 * @author Alan Yin
 * @date 2020/10/14
 */

public interface MetricsStorage {

    void saveRequestInfo(RequestInfo requestInfo);

    List<RequestInfo> getRequestInfos(String apiName, long startTimeInMills, long endTimeInMills);

    Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMills, long endTimeInMills);

}
