package com.practice.singleton.impl4;

/**
 * 双重校验锁-线程安全
 * <p>
 * 需要 volatile 防止 JVM 指令重排，对其他线程可见；
 * 同步代码块内还需要再一次判空
 *
 * @author yinxing
 * @date 2019/6/20
 */

public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                // 如果不判空，如 A,B 两个线程同时进入上面的判空，会出现两次实例化，只是先后问题
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
