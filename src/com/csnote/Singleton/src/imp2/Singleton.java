package com.csnote.Singleton.src.imp2;

/**
 * 懒汉式-线程安全
 * <p>
 * 只需要对 getUniqueInstance() 方法加锁，那么在一个时间点只能有一个线程能够进入该方法，从而避免了实例化多次 uniqueInstance。
 * <p>
 * 但是当一个线程进入该方法之后，其它试图进入该方法的线程都必须等待，即使 uniqueInstance 已经被实例化了。这会让线程阻塞时间过长，因此该方法有性能问题，不推荐使用。
 */
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {
    }

    /**
     * synchronized 使用在方法上带来线程阻塞，会出现性能问题
     */
    public static synchronized Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}