package com.beauty_design_mode.lecture56.demo2.bad;

import com.beauty_design_mode.lecture56.demo2.support.PromotionService;
import com.beauty_design_mode.lecture56.demo2.support.UserService;

/**
 * @author Alan Yin
 * @date 2021/3/19
 */

public class UserController {

    // 依赖注入
    private UserService userService;
    private PromotionService promotionService;

    public Long register(String username, String password) {
        // 省略其他业务代码
        long userId = userService.register(username, password);
        promotionService.issueNewUserExperienceCash(userId);
        return userId;
    }
}
