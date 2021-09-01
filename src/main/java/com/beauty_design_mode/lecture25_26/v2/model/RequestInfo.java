package com.beauty_design_mode.lecture25_26.v2.model;

import lombok.Data;

/**
 * 请求信息
 *
 * @author Alan Yin
 * @date 2020/10/14
 */
@Data
public class RequestInfo {

    private String apiName;

    private double responseTime;

    private double timestamp;

    public RequestInfo(String apiName, double responseTime, double timestamp) {
        this.apiName = apiName;
        this.responseTime = responseTime;
        this.timestamp = timestamp;
    }

}
