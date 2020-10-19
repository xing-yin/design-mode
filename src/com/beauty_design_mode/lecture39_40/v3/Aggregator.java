package com.beauty_design_mode.lecture39_40.v3;

import com.beauty_design_mode.lecture39_40.v3.model.RequestInfo;
import com.beauty_design_mode.lecture39_40.v3.model.RequestStat;

import java.util.*;

/**
 * 聚合器
 * <p>
 * review 分析:
 * v2 版本问题： 只有一个静态函数,负责各种统计数据的计算。当需要扩展新的统计功能的时候，需要修改 aggregate() 函数代码，
 * 并且一旦越来越多的统计功能添加进来之后，这个函数的代码量会持续增加，可读性、可维护性就变差了。
 * 所以，这个类的设计可能存在职责不够单一、不易扩展等问题，需要在之后的版本中，对其结构做优化。
 * <p>
 * 重构方式:
 * 根据原始数据，计算得到统计数据。我们可以将这部分逻辑移动到 Aggregator 类中。这样 Aggregator 类就不仅仅是只包含统计方法的工具类了。
 *
 * @author Alan Yin
 * @date 2020/10/19
 */

public class Aggregator {

    public Map<String, RequestStat> aggregate(Map<String, List<RequestInfo>> requestInfos, long durationInMills) {
        Map<String, RequestStat> requestStats = new HashMap<>();
        for (Map.Entry<String, List<RequestInfo>> entry : requestInfos.entrySet()) {
            String apiName = entry.getKey();
            List<RequestInfo> requestInfosPerApi = entry.getValue();
            RequestStat requestStat = doAggregate(requestInfosPerApi, durationInMills);
            requestStats.put(apiName, requestStat);
        }
        return requestStats;
    }

    private RequestStat doAggregate(List<RequestInfo> requestInfos, long durationInMills) {
        List<Double> respTimes = new ArrayList<>();
        for (RequestInfo requestInfo : requestInfos) {
            double respTime = requestInfo.getResponseTime();
            respTimes.add(respTime);
        }

        RequestStat requestStat = new RequestStat();
        requestStat.setMaxResponseTime(max(respTimes));
        requestStat.setMinResponseTime(min(respTimes));
        requestStat.setAvgResponseTime(avg(respTimes));
        requestStat.setP99ResponseTime(percentile99(respTimes));
        requestStat.setP999ResponseTime(percentile999(respTimes));
        requestStat.setCount(respTimes.size());
        requestStat.setTps((long) tps(respTimes.size(), durationInMills / 1000));
        return requestStat;
    }

    private double tps(int size, long ratio) {
        return 0;
    }

    private double percentile999(List<Double> dataset) {
        return 0;
    }

    private double percentile99(List<Double> dataset) {
        return 0;
    }

    private double avg(List<Double> dataset) {
        return 0;
    }

    private double min(List<Double> dataset) {
        return 0;
    }

    private double max(List<Double> dataset) {
        return 0;
    }

}
