package com.practice.singleton.impl3;

/**
 * 饿汉式-线程安全
 * <p>
 * 不采用懒加载方式，应用启动直接创建实例，不存在多次实例化的问题，线程安全
 * <p>
 * 在资源比较紧张和创建开销比较大，但用不到时，不建议这种做
 *
 * @author yinxing
 * @date 2019/6/20
 */

public class Singleton {

    public static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getUniqueInstance() {
        return uniqueInstance;
    }
}
