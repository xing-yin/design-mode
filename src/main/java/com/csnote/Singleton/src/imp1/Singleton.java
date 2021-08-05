package com.csnote.Singleton.src.imp1;

/**
 * 单件模式整体思路:
 * 使用一个私有构造函数、一个私有静态变量以及一个公有静态函数来实现
 * <p>
 * 私有构造函数保证了不能通过构造函数来创建对象实例，只能通过公有静态函数返回唯一的私有静态变量。
 * <p>
 */

/**
 * 懒汉式-线程不安全
 * <p>
 * 以下实现中，私有静态变量 uniqueInstance 被延迟实例化，这样做的好处是，如果没有用到该类，那么就不会实例化 uniqueInstance，从而节约资源。
 * <p>
 * 这个实现在多线程环境下是不安全的，如果多个线程能够同时进入 if (uniqueInstance == null) ，并且此时 uniqueInstance 为 null，
 * 那么会有多个线程执行 uniqueInstance = new Singleton(); 语句，这将导致实例化多次 uniqueInstance。
 */
public class Singleton {

    private static Singleton uniqueInstance;

    /**
     * 私有的构造函数
     */
    private Singleton() {
    }

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}