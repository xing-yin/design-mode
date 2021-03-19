package com.beauty_design_mode.lecture56.demo2.good;

/**
 * 注册的观察者
 *
 * @author Alan Yin
 * @date 2021/3/19
 */

public interface RegisterObserver {

    /**
     * 处理注册成功
     *
     * @param userId
     */
    void handleRegisterSuccess(Long userId);

}
