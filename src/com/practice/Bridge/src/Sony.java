package com.practice.Bridge.src;

/**
 * @author yinxing
 * @date 2019/6/26
 */

public class Sony implements TV {

    @Override
    public void on() {
        System.out.println("Sony on");
    }

    @Override
    public void off() {
        System.out.println("Sony off");
    }

    @Override
    public void tuneChannel() {
        System.out.println("Sony tuneChannel");
    }
}
