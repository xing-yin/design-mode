package com.headfirst.singleton.threadsafe;

/**
 * synchronized关键字
 * 缺点:同步会降低性能(每次都会进入到同步，优化可见"双重检查加锁")
 */
public class Singleton {
    private static Singleton uniqueInstance;

    // other useful instance variables here
    private Singleton() {
    }

    /**
     * 关键在于synchronized关键字，确保不会有多个线程同时进入这个方法
     *
     * @return
     */
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }
}
