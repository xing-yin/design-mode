package com.beauty_design_mode.lecture19.demo1.no_ioc;

/**
 * 无控制反转演示
 *
 * @author Alan Yin
 * @date 2021/8/13
 */

public class UserServiceTest {

    public static boolean doTest() {
        // do something
        return false;
    }

    // 这部分逻辑可以放到框架中
    public static void main(String[] args) {
        if (doTest()) {
            System.out.println("Test succeed.");
        } else {
            System.out.println("Test failed.");
        }
    }

}
