package com.beauty_design_mode.lecture41.demo2;

/**
 * 方式2:饱汉式
 * <p>
 * 直接在方法上加锁，高并发时性能不好
 *
 * @author Alan Yin
 * @date 2021/1/15
 */

public class IdGenerator {

    private IdGenerator() {
    }

    private static IdGenerator instance;

    public static synchronized IdGenerator getInstance() {
        if (instance == null) {
            return new IdGenerator();
        }
        return instance;
    }
}
