package com.headfirst.singleton.classic;

// NOTE: This is not thread safe!
/**
 * 经典的单件模式（非线程安全）
 */
public class Singleton {

    /**
     * 利用一个静态变量类记录Singleton类的唯一实例
     */
    private static Singleton uniqueInstance;

    /**
     * 注意把构造器声明为私有的
     */
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a classic Singleton!";
    }
}
