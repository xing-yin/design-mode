package com.runoob.Duck.domain;

import com.runoob.Duck.service.serviceImpl.FlyWithWings;
import com.runoob.Duck.service.serviceImpl.Quack;

/**
 * Created by yinxing on 2018/3/10.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
