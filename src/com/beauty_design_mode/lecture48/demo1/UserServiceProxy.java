package com.beauty_design_mode.lecture48.demo1;

import com.beauty_design_mode.lecture39_40.v3.RedisMetricsStorage;
import com.beauty_design_mode.lecture39_40.v3.model.RequestInfo;
import com.beauty_design_mode.lecture39_40.v5.MetricsCollector;
import com.beauty_design_mode.lecture48.bad.UserVo;

/**
 * 原始类和代理类实现相同的接口，基于接口而非实现编程（使用了委托）
 *
 * @author Alan Yin
 * @date 2021/3/3
 */

public class UserServiceProxy implements IUserService {

    private MetricsCollector metricsCollector; // 依赖注入

    private UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
        metricsCollector = new MetricsCollector(new RedisMetricsStorage());
    }

    @Override
    public UserVo login(String username, String password) {
        long startTime = System.currentTimeMillis();
        // 委托
        UserVo userVo = userService.login(username, password);
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTime);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }

    @Override
    public UserVo register(String username, String password) {
        long startTime = System.currentTimeMillis();
        // 委托
        UserVo userVo = userService.register(username, password);
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        RequestInfo requestInfo = new RequestInfo("register", responseTime, startTime);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }

    public static void main(String[] args) {
        IUserService userService = new UserServiceProxy(new UserService());
        userService.login("test", "123456");
    }

}
