package com.practice.Singleton.impl5;

/**
 * 静态内部类实现
 * <p>
 * 与双重锁作用类似，并且也是懒加载，只有在真正调用实例化方法，内部静态类才被触发
 *
 * @author yinxing
 * @date 2019/6/20
 */

public class Singleton {

    private Singleton() {
    }

    private static class SingletonHolder {
        private static Singleton uniqueInstance = new Singleton();
    }

    public static Singleton getUniqueInstance() {
        return SingletonHolder.uniqueInstance;
    }
}
