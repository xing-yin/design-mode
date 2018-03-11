package com.chap1.Duck.service.serviceImpl;

import com.chap1.Duck.service.FlyBehavior;

/**
 * Created by yinxing on 2018/3/10.
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
