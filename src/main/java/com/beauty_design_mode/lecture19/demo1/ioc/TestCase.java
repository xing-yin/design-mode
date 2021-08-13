package com.beauty_design_mode.lecture19.demo1.ioc;

/**
 * @author Alan Yin
 * @date 2021/8/13
 */

public abstract class TestCase {

    public void run() {
        if (doTest()) {
            System.out.println("Test succeed.");
        } else {
            System.out.println("Test failed.");
        }
    }

    public abstract boolean doTest();

}
