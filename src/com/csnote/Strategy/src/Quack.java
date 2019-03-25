package com.csnote.Strategy.src;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("quack!");
    }
}
