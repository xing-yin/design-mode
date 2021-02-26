package com.beauty_design_mode.lecture41.demo3;

/**
 * 方式3：双重加锁
 *
 * @author Alan Yin
 * @date 2021/1/15
 */

public class IdGenerator {

    private IdGenerator() {
    }

    // volatile 防止指令重排
    private static volatile IdGenerator instance;

    public IdGenerator getInstance() {
        if (instance == null) {
            synchronized (IdGenerator.class) {
                if (instance == null) {
                    return new IdGenerator();
                }
            }
        }
        return instance;
    }
}
