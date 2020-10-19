package com.beauty_design_mode.lecture39_40.v3.model;

/**
 * 请求信息
 *
 * @author Alan Yin
 * @date 2020/10/14
 */

public class RequestInfo {

    private String apiName;

    private double responseTime;

    private double timestamp;

    public RequestInfo(String apiName, double responseTime, double timestamp) {
        this.apiName = apiName;
        this.responseTime = responseTime;
        this.timestamp = timestamp;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public double getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(double responseTime) {
        this.responseTime = responseTime;
    }

    public double getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(double timestamp) {
        this.timestamp = timestamp;
    }
}
