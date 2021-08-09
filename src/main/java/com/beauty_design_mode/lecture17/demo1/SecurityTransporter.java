package com.beauty_design_mode.lecture17.demo1;

import com.beauty_design_mode.lecture25_26.support.StringUtils;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;

/**
 * 父类 Transporter 使用 org.apache.http 库中的 HttpClient 类来传输网络数据。
 * 子类 SecurityTransporter 继承父类 Transporter，增加了额外的功能，支持传输 appId 和 appToken 安全认证信息。
 * <p>
 * 子类的设计要保证在替换父类的时候，不改变原有程序的逻辑以及不破坏原有程序的正确性。
 *
 * @author Alan Yin
 * @date 2021/8/9
 */

public class SecurityTransporter extends Transporter {

    private String appId;

    private String appSecret;

    public SecurityTransporter(HttpClient httpClient, String appId, String appSecret) {
        super(httpClient);
        this.appId = appId;
        this.appSecret = appSecret;
    }

    // 改造前
    @Override
    public HttpResponse senRequest(HttpRequest request) {
        if (!StringUtils.isBlank(appId) && !StringUtils.isBlank(appSecret)) {
            request.addHeader("app-id", appId);
            request.addHeader("app-secret", appSecret);
        }
        return super.senRequest(request);
    }

    // 改造后【反例】
    // 尽管代码中抛出的是运行时异常（Runtime Exception），可以不在代码中显式地捕获处理，
    // 但子类替换父类传递进 demoFunction 函数之后，整个程序的逻辑行为有了改变。===> 不满足里式替换原则
    public HttpResponse senRequest2(HttpRequest request) {
        if (StringUtils.isBlank(appId) || StringUtils.isBlank(appSecret)) {
            throw new IllegalArgumentException("appId and appSecret can not be null");
        }
        request.addHeader("app-id", appId);
        request.addHeader("app-secret", appSecret);
        return super.senRequest(request);
    }

}
