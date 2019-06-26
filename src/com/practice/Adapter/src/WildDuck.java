package com.practice.Adapter.src;

/**
 * @author yinxing
 * @date 2019/6/26
 */

public class WildDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("WildDuck quack");
    }
}
