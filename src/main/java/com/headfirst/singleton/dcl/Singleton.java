package com.headfirst.singleton.dcl;

//
// Danger!  This implementation of Singleton not
// guaranteed to work prior to Java 5

/**
 * 用"双重检查加锁"，在getInstance()中减少使用同步
 * 优点:【可以大大减少同步带来的性能损耗】
 * 注意:不适用于1.4及更早版本的java
 */
public class Singleton {
    /**
     * volatile确保:当uniqueInstance变量被初始化成Singleton实例时，
     * 多个线程正确地处理uniqueInstance变量
     */
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            //如果实例不存在，才进入同步区块
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    //辅助打印方法
    public String getDescription() {
        return "I'm a Singleton!";
    }
}
