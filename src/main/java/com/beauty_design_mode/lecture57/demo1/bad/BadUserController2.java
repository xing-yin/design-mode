package com.beauty_design_mode.lecture57.demo1.bad;

import com.beauty_design_mode.lecture56.demo2.good.RegisterObserver;
import com.beauty_design_mode.lecture56.demo2.support.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/**
 * 异步非阻塞实现2
 * <p>
 * 其他代码与 com.beauty_design_mode.lecture56.demo2.good 包下相同，不再赘述
 * <p>
 * 缺点：尽管利用了线程池解决了第一种实现方式的问题，但线程池、异步执行逻辑都耦合在了 register() 函数中，增加了这部分业务代码的维护成本。
 *
 * @author Alan Yin
 * @date 2021/3/19
 */

public class BadUserController2 {

    // 依赖注入
    private UserService userService;

    private List<RegisterObserver> registerObservers = new ArrayList<>();

    private Executor executor;

    public BadUserController2(Executor executor) {
        this.executor = executor;
    }

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
            executor.execute(() -> {
                observer.handleRegisterSuccess(userId);
            });
        }
        return userId;
    }
}
