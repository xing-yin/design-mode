package com.beauty_design_mode.lecture41.demo1;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 方式1：饿汉式
 *
 * @author Alan Yin
 * @date 2021/1/15
 */

public class IdGenerator {

    private IdGenerator() {
    }

    private static final IdGenerator INSTANCE = new IdGenerator();

    private final AtomicLong atomicLong = new AtomicLong(0);

    public static IdGenerator getInstance() {
        return INSTANCE;
    }

    public long getId() {
        return atomicLong.incrementAndGet();
    }
}
