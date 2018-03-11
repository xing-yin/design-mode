package com.chap1.Duck.service.serviceImpl;

import com.chap1.Duck.service.QuackBehavior;

/**
 * Created by yinxing on 2018/3/10.
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
