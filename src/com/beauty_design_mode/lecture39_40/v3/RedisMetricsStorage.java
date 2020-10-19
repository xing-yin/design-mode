package com.beauty_design_mode.lecture39_40.v3;

import com.beauty_design_mode.lecture39_40.v3.model.RequestInfo;

import java.util.List;
import java.util.Map;

/**
 * (与v2 相同，设计与实现比较简单，不是 V3 重构的重点)
 *
 * @author Alan Yin
 * @date 2020/10/14
 */

public class RedisMetricsStorage implements MetricsStorage {

    //...省略属性和构造函数等...

    @Override
    public void saveRequestInfo(RequestInfo requestInfo) {
        //...
    }

    @Override
    public List<RequestInfo> getRequestInfos(String apiName, long startTimeInMills, long endTimeInMills) {
        return null;
    }

    @Override
    public Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMills, long endTimeInMills) {
        return null;
    }
}
