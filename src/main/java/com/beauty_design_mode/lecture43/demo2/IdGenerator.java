package com.beauty_design_mode.lecture43.demo2;

/**
 * 集群环境下的单例实现(伪代码)
 *
 * @author Alan Yin
 * @date 2021/1/17
 */

public class IdGenerator {

    private static IdGenerator instance;

    private static SharedObjectsStorage storage = new RedisSharedObjectsStorage();

    private static DistributedLock lock = new DistributedLock();

    private IdGenerator() {
    }

    public static synchronized IdGenerator getInstance() {
        if (instance == null) {
            lock.lock();
            instance = storage.load(IdGenerator.class);
        }
        return instance;
    }

    public synchronized void freeInstance() {
        storage.save(this, IdGenerator.class);
        instance = null; // 释放对象
        lock.unlock();
    }
}
