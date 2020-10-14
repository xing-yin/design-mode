package com.beauty_design_mode.lecture25_26.v1;

import com.beauty_design_mode.lecture25_26.support.UserVo;

import java.util.concurrent.TimeUnit;

/**
 * 应用场景：统计下面两个接口(注册和登录）的响应时间和访问次数
 *
 * @author Alan Yin
 * @date 2020/10/14
 */

public class UserController {

    private Metrics metrics = new Metrics();

    public UserController() {
        this.metrics.startRepeatedReport(60, TimeUnit.SECONDS);
    }

    public void register(UserVo user) {
        long startTimestamp = System.currentTimeMillis();
        metrics.recordTimestamp("register", startTimestamp);
        // ...
        long responseTime = System.currentTimeMillis() - startTimestamp;
        metrics.recordResponseTime("register", responseTime);
    }

    public UserVo login(String username, String password) {
        long startTimestamp = System.currentTimeMillis();
        metrics.recordTimestamp("login", startTimestamp);
        // ...
        long responseTime = System.currentTimeMillis() - startTimestamp;
        metrics.recordResponseTime("login", responseTime);

        return null;
    }
}
