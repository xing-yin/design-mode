package com.beauty_design_mode.lecture25_26.v1;

import com.beauty_design_mode.lecture25_26.support.Gson;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Alan Yin
 * @date 2020/10/14
 */

public class Metrics {

    private Map<String, List<Double>> responseTimes = new HashMap<>();

    private Map<String, List<Double>> timestamps = new HashMap<>();

    private ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

    public void recordResponseTime(String apiName, double responseTime) {
        responseTimes.putIfAbsent(apiName, new ArrayList<>());
        responseTimes.get(apiName).add(responseTime);
    }

    public void recordTimestamp(String apiName, double timestamp) {
        timestamps.putIfAbsent(apiName, new ArrayList<>());
        timestamps.get(apiName).add(timestamp);
    }

    public void startRepeatedReport(long period, TimeUnit timeUnit) {
        executorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                Gson gson = new Gson();
                Map<String, Map<String, Double>> stats = new HashMap<>();
                for (Map.Entry<String, List<Double>> entry : responseTimes.entrySet()) {
                    String apiName = entry.getKey();
                    List<Double> apiResponseTimes = entry.getValue();
                    stats.putIfAbsent(apiName, new HashMap<>());
                    stats.get(apiName).put("max", max(apiResponseTimes));
                    stats.get(apiName).put("avg", avg(apiResponseTimes));
                }

                for (Map.Entry<String, List<Double>> entry : timestamps.entrySet()) {
                    String apiName = entry.getKey();
                    List<Double> apiTimestamps = entry.getValue();
                    stats.putIfAbsent(apiName, new HashMap<>());
                    stats.get(apiName).put("count", (double) apiTimestamps.size());
                }
                System.out.println(gson.toJson(stats));
            }
        }, 0, period, timeUnit);
    }

    private double avg(List<Double> apiResponseTimes) {
        return 0;
    }

    private double max(List<Double> apiResponseTimes) {
        return 0;
    }

}
