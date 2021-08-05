package com.practice.Singleton.impl2;

/**
 * 懒汉-线程安全
 * <p>
 * 通过加锁保证线程安全，但是在方法上加锁可能造成线程阻塞，性能开销较大(大多数情况下不需要)【不推荐】
 *
 * @author yinxing
 * @date 2019/6/20
 */

public class Singleton {

    public static Singleton uniqueInstance;

    private Singleton() {
    }

    public static synchronized Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
