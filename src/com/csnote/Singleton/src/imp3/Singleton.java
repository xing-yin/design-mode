package com.csnote.Singleton.src.imp3;

/**
 * 饿汉式-线程安全
 * <p>
 * 线程不安全问题主要是由于 uniqueInstance 被实例化多次，采取直接实例化 uniqueInstance 的方式就不会产生线程不安全问题。
 * <p>
 * 但是直接实例化的方式也丢失了延迟实例化带来的节约资源的好处。
 */
public class Singleton {

    /**
     * 直接实例化
     */
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getUniqueInstance() {
        return uniqueInstance;
    }
}