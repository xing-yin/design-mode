package com.csnote.Singleton.src.imp5;

/**
 * 静态内部类实现
 * <p>
 * 当 Singleton 类加载时，静态内部类 SingletonHolder 没有被加载进内存。
 * 只有当调用 getUniqueInstance() 方法从而触发 SingletonHolder.INSTANCE 时 SingletonHolder 才会被加载，
 * 此时初始化 INSTANCE 实例，并且 JVM 能确保 INSTANCE 只被实例化一次。
 * <p>
 * 因为 SingletonHolder 类没有被主动使用， 只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder 类，从而实例化 instance。
 * <p>
 * 这种方式不仅具有延迟初始化的好处，而且由 JVM 提供了对线程安全的支持。
 */
public class Singleton {

    private Singleton() {
    }

    /// todo 为什么 当 Singleton 类加载时，静态内部类 SingletonHolder 没有被加载进内存？查看一下虚拟机的加载机制
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getUniqueInstance() {
        return SingletonHolder.INSTANCE;
    }
}