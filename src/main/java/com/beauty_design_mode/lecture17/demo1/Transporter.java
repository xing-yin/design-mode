package com.beauty_design_mode.lecture17.demo1;


import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;

/**
 * 里式替换原则
 *
 * @author Alan Yin
 * @date 2021/8/9
 */

public class Transporter {

    private HttpClient httpClient;

    public Transporter(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public HttpResponse senRequest(HttpRequest request) {
        // use httpClient to send request
        return null;
    }

}
