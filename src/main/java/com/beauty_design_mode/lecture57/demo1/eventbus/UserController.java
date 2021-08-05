package com.beauty_design_mode.lecture57.demo1.eventbus;

import com.beauty_design_mode.lecture39_40.v5.support.AsyncEventBus;
import com.beauty_design_mode.lecture39_40.v5.support.EventBus;
import com.beauty_design_mode.lecture56.demo2.good.RegisterObserver;
import com.beauty_design_mode.lecture56.demo2.support.UserService;

import java.util.List;
import java.util.concurrent.Executors;

/**
 * 使用 Google EventBus 实现观察者模式
 *
 * @author Alan Yin
 * @date 2021/3/22
 */

public class UserController {

    // 依赖注入
    private UserService userService;

    private EventBus eventBus;

    private static final int DEFAULT_ENVENTBUS_THREAD_POOL_SIZE = 20;

    public UserController() {
        eventBus = new EventBus(); // 同步阻塞的方式
        eventBus = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_ENVENTBUS_THREAD_POOL_SIZE)); // 异步非阻塞的方式
    }

    public void setRegisterObservers(List<RegisterObserver> observers) {
        eventBus.register(observers);
    }

    public Long register(String username, String password) {
        // 省略其他业务代码
        long userId = userService.register(username, password);
        eventBus.post(userId);
        return userId;
    }
}
