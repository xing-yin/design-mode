package com.beauty_design_mode.lecture56.demo2.good;

import com.beauty_design_mode.lecture56.demo2.support.NotificationService;

/**
 * 注册通知观察者
 *
 * @author Alan Yin
 * @date 2021/3/19
 */

public class RegisterNotificationObserver implements RegisterObserver{

    private NotificationService notificationService;

    @Override
    public void handleRegisterSuccess(Long userId) {
        notificationService.sendInboxMessage(userId, "Welcome to xxxx");
    }
}
