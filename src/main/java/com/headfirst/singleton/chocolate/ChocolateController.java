package com.headfirst.singleton.chocolate;

public class ChocolateController {
    public static void main(String args[]) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        // will return the existing instance
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();

        /**
         * 验证两者是不是同一个实例
         */
        System.out.println(boiler.equals(boiler2));
    }
}
