package com.beauty_design_mode.lecture13_14.auth;

/**
 * @author Alan Yin
 * @date 2020/10/12
 */

public class ApiRequest {

    private String baseUrl;

    private String token;

    private String appId;

    private long timestamp;

    public ApiRequest(String baseUrl, String token, String appId, long timestamp) {
        this.baseUrl = baseUrl;
        this.token = token;
        this.appId = appId;
        this.timestamp = timestamp;
    }

    public static ApiRequest buildFromUrl(String url) {
        return null;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getToken() {
        return token;
    }

    public String getAppId() {
        return appId;
    }

    public long getTimestamp() {
        return timestamp;
    }

}
