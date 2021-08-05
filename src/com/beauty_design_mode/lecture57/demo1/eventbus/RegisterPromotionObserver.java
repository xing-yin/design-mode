package com.beauty_design_mode.lecture57.demo1.eventbus;

import com.beauty_design_mode.lecture39_40.v5.support.Subscribe;
import com.beauty_design_mode.lecture56.demo2.good.RegisterObserver;
import com.beauty_design_mode.lecture56.demo2.support.PromotionService;

/**
 * 注册促销观察者
 *
 * @author Alan Yin
 * @date 2021/3/19
 */

public class RegisterPromotionObserver implements RegisterObserver {

    // 依赖注入
    private PromotionService promotionService;

    // @Subscribe 注解来标明类中哪个函数可以接收被观察者发送的消息
    @Subscribe
    @Override
    public void handleRegisterSuccess(Long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
