package com.beauty_design_mode.lecture41.demo4;

/**
 * 方式4：静态内部类
 *
 * @author Alan Yin
 * @date 2021/1/15
 */

public class IdGenerator {

    private IdGenerator() {
    }

    private static class SingletonHolder {
        private static final IdGenerator INSTANCE = new IdGenerator();
    }

    public static IdGenerator getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

