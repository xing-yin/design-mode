package com.beauty_design_mode.lecture25_26.v2;

import com.beauty_design_mode.lecture25_26.v2.model.RequestInfo;

import java.util.List;
import java.util.Map;

/**
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
