package com.csnote.Strategy.src;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeak!");
    }
}
