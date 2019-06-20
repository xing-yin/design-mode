package com.practice.singleton.imp1;

/**
 * 模式名:单例模式
 * 背景:全局只需要一个实例
 * 优势：减少内存消耗(只有一个实例);
 * 劣势:没有接口。不能继承，与单一原则冲突
 * 适用场景：保证一个类只有一个实例，并
 * 关键部分:构造器私有 + 提供一个静态方法给调用方使用
 * 原理和实现:见代码
 * 同类型的其他实现:多种不同实现
 * <p>
 * 懒汉-线程不安全
 * <p>
 * 多线程时线程不安全，可能会被多次实例化（不推荐使用）
 *
 * @author yinxing
 * @date 2019/6/20
 */

public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

}
