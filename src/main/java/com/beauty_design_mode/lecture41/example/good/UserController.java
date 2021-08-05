package com.beauty_design_mode.lecture41.example.good;

/**
 * @author Alan Yin
 * @date 2021/1/15
 */

public class UserController {


    public void login(String username, String password) {
        // 省略业务代码
        Logger.getInstance().log(username + "login");
    }

}
