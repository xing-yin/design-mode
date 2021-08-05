package com.beauty_design_mode.lecture56.demo2.good;

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

    @Override
    public void handleRegisterSuccess(Long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
