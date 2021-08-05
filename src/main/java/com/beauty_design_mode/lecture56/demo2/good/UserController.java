package com.beauty_design_mode.lecture56.demo2.good;

import com.beauty_design_mode.lecture56.demo2.support.PromotionService;
import com.beauty_design_mode.lecture56.demo2.support.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alan Yin
 * @date 2021/3/19
 */

public class UserController {

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
            observer.handleRegisterSuccess(userId);
        }
        return userId;
    }
}
