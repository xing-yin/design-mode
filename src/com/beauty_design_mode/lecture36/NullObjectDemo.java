package com.beauty_design_mode.lecture36;

import com.beauty_design_mode.lecture36.support.User;

import java.util.Collections;
import java.util.List;

/**
 * 函数出错返回方式3-返回空对象
 *
 * @author Alan Yin
 * @date 2020/10/16
 */

public class NullObjectDemo {

    /**
     * 使用空集合代替 null
     *
     * @param telephoePrefix
     * @return
     */
    public List<User> getUsers(String telephoePrefix) {
        // 没有找到数据
        return Collections.emptyList();
    }

    /**
     * 使用空字符串代替 null
     *
     * @param text
     * @return
     */
    public String retrieveUppercaseLetters(String text) {
        // 如果text中没有大写字母，返回空字符串，而非NULL值
        return "";
    }

    public static void main(String[] args) {
        NullObjectDemo demo = new NullObjectDemo();
        List<User> users = demo.getUsers("132");
        // 这里不需要做NULL值判断
        for (User user : users) {
            // do something
        }

        String uppercaseLetters = demo.retrieveUppercaseLetters("yx");
        // 不需要做NULL值判断
        int length = uppercaseLetters.length();
        System.out.println("Contains " + length + " upper case letters.");
    }
}
