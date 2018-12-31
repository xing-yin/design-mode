package com.runoob.Duck.service.serviceImpl;

import com.runoob.Duck.service.FlyBehavior;

/**
 * Created by yinxing on 2018/3/10.
 */
public class FlyRocektPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
