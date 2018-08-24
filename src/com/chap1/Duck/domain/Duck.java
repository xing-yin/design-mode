package com.chap1.Duck.domain;

import com.chap1.Duck.service.FlyBehavior;
import com.chap1.Duck.service.QuackBehavior;

/**
 * Created by yinxing on 2018/3/10.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;

     QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void swim() {
        System.out.println("All ducks float!");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}