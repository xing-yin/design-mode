package com.beauty_design_mode.lecture57.demo1.bad;

import com.beauty_design_mode.lecture56.demo2.good.RegisterObserver;
import com.beauty_design_mode.lecture56.demo2.support.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * 异步非阻塞实现1
 * <p>
 * 其他代码与 com.beauty_design_mode.lecture56.demo2.good 包下相同，不再赘述
 * <p>
 * 缺点:频繁地创建和销毁线程比较耗时，并且并发线程数无法控制，创建过多的线程会导致堆栈溢出。
 *
 * @author Alan Yin
 * @date 2021/3/19
 */

public class BadUserController1 {

    // 依赖注入
    private UserService userService;

    private List<RegisterObserver> registerObservers = new ArrayList<>();

    /**
     * 此处为一次注册好，不能动态修改（实际根据需要可能动态增删）
     *
     * @param observers
     */
    public void setRegisterObservers(List<RegisterObserver> observers) {
        registerObservers.addAll(observers);
    }

    public Long register(String username, String password) {
        // 省略其他业务代码
        long userId = userService.register(username, password);
        for (RegisterObserver observer : registerObservers) {
            new Thread(() -> {
                observer.handleRegisterSuccess(userId);
            });
        }
        return userId;
    }
}
