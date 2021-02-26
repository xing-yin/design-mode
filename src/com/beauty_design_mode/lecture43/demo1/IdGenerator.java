package com.beauty_design_mode.lecture43.demo1;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 线程内唯一的单例
 *
 * @author Alan Yin
 * @date 2021/1/17
 */

public class IdGenerator {

    private static final ConcurrentHashMap<Long, IdGenerator> instances = new ConcurrentHashMap<>();

    private IdGenerator() {
    }

    public static IdGenerator getInstance() {
        Long currentThreadId = Thread.currentThread().getId();
        instances.putIfAbsent(currentThreadId, new IdGenerator());
        return instances.get(currentThreadId);
    }

}
