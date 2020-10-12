package com.beauty_design_mode.lecture13_14.auth;

import java.util.Map;

/**
 * 设计要点:
 * - 从业务模型上来说，不应该属于这个类的属性和方法，不应该被放到这个类里
 * - 不能单纯地依赖当下的需求，还要分析这个类从业务模型上来讲，理应具有哪些属性和方法。(为将来的扩展考虑)
 *
 * @author Alan Yin
 * @date 2020/10/12
 */

public class AuthToken {

    private static final long DEFAULT_EXPIRED_INTERVAL = 60 * 1000;

    private String token;

    private long createTime;

    private long expiredTimeInterval = DEFAULT_EXPIRED_INTERVAL;

    public AuthToken(String token, long createTime) {
        this.token = token;
        this.createTime = createTime;
    }

    public AuthToken(String token, long createTime, long expiredTimeInterval) {
        this.token = token;
        this.createTime = createTime;
        this.expiredTimeInterval = expiredTimeInterval;
    }

    public static AuthToken generate(String baseUrl, String appId, String password, long createTime) {
        return null;
    }

    public String getToken() {
        return token;
    }

    public boolean isExpired() {
        return true;
    }

    public boolean match(AuthToken token) {
        return true;
    }
}
