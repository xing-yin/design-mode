package com.headfirst.singleton.stat;

/**
 * 使用"急切"创建实例，而不用延迟实例化的做法
 * 依赖JVM在加载这个类时马上创建此唯一的实例
 */
public class Singleton {
    /**
     * 静态初始化器中创建单件。这段代码保证了线程安全
     */
    private static Singleton uniqueInstance = new Singleton();

    /**
     * 构造器也是私有的
     */
    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a statically initialized Singleton!";
    }
}
