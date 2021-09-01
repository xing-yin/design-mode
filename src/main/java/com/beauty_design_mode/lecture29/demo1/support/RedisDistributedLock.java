package com.beauty_design_mode.lecture29.demo1.support;

/**
 * @author Alan Yin
 * @date 2021/8/30
 */

public class RedisDistributedLock {

    public static RedisDistributedLock getSingletonIntance() {
        return null;
    }

    public boolean lockTransction(String id) {
        return false;
    }

    public void unlockTransction(String id) {
    }
}
