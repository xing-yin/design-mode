package com.runoob.Duck.service.serviceImpl;

import com.runoob.Duck.service.QuackBehavior;

/**
 * Created by yinxing on 2018/3/10.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
