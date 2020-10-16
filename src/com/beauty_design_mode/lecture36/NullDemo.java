package com.beauty_design_mode.lecture36;


import com.beauty_design_mode.lecture36.support.User;

/**
 * 函数出错返回方式2-返回 NULL 值
 *
 * @author Alan Yin
 * @date 2020/10/16
 */

public class NullDemo {

    public User getUser(String telephone) {
        // 如果用户不存在，则返回null
        return null;
    }

    public static void main(String[] args) {
        NullDemo demo = new NullDemo();
        User user = demo.getUser("12345");
        // 做NULL值判断，否则有可能会报NPE
        if (user != null) {
            String email = user.getEmail();
            // 做NULL值判断，否则有可能会报NPE
            if (email != null) {
                String escapedEmail = email.replaceAll("@", "#");
            }
        }
    }
}
