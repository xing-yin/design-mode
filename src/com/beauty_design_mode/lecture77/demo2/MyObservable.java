package com.beauty_design_mode.lecture77.demo2;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

/**
 * jdk 的观察者参考实现
 *
 * @author Alan Yin
 * @date 2020/9/18
 */

public class MyObservable {

    private boolean changed = false;
    private Vector<Observer> observers;

    public MyObservable() {
        this.observers = new Vector<>();
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    /**
     * 为了线程安全，直接在方法上加锁会降低并发性能。
     * <p>
     * 为了提高并发常用方法，减少锁范围。
     * 一个常用方法: 利用局部变量是线程安全的，拷贝一份副本，基于副本再去做操作。
     * (劣势:这期间对观察者的新增和删除不能生效，看业务场景能否接受)
     */
    private void notifyObservers(Object arg) {
        Object[] arrLocal;

        /**
         * 关键实现
         */
        synchronized (this) {
            if (!changed) {
                return;
            }
            arrLocal = observers.toArray();
            clearChange();
        }

        for (int i = 0; i < arrLocal.length; i++) {
            // 调用观察者方法
            // ((Observer) arrLocal[i]).update(this, arg);
        }
    }

    private void clearChange() {
        changed = false;
    }
}
