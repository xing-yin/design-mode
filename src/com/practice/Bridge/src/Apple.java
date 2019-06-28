package com.practice.Bridge.src;

/**
 * @author yinxing
 * @date 2019/6/26
 */

public class Apple implements TV {

    @Override
    public void on() {
        System.out.println("Apple on");
    }

    @Override
    public void off() {
        System.out.println("Apple off");
    }

    @Override
    public void tuneChannel() {
        System.out.println("Apple tuneChannel");
    }
    
}
