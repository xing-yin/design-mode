package com.chap1.Duck.domain;

import com.chap1.Duck.service.serviceImpl.FlyNoWay;
import com.chap1.Duck.service.serviceImpl.Quack;

/**
 * Created by yinxing on 2018/3/10.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
