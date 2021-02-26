package com.beauty_design_mode.lecture43.demo3;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 多例模式2，还有一种理解方式：同一类型的只能创建一个对象，不同类型的可以创建多个对象
 *
 * @author Alan Yin
 * @date 2021/1/17
 */

public class Logger {

    private static final ConcurrentHashMap<String, Logger> instances = new ConcurrentHashMap<>();

    private Logger() {
    }

    public static Logger getInstance(String loggerName) {
        instances.putIfAbsent(loggerName, new Logger());
        return instances.get(loggerName);
    }

}
