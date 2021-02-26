package com.beauty_design_mode.lecture43.demo1;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 通过 ThreadLocal 实现线程内唯一的单例
 *
 * @author Alan Yin
 * @date 2021/1/17
 */

public class IdGeneratorByThreadLocal {

    /**
     * 必须重新实现 initialValue，因为默认实现固定返回 null
     */
    private static final ThreadLocal<IdGeneratorByThreadLocal> threadLocal = new ThreadLocal() {
        @Override
        protected IdGeneratorByThreadLocal initialValue() {
            return new IdGeneratorByThreadLocal();
        }
    };

    private IdGeneratorByThreadLocal() {
    }

    public static IdGeneratorByThreadLocal getInstance() {
        return threadLocal.get();
    }

    public static void main(String[] args) {
        // 相同线程唯一
        System.out.println("main thread:" + IdGeneratorByThreadLocal.getInstance());
        System.out.println("main thread:" + IdGeneratorByThreadLocal.getInstance());
        System.out.println("main thread:" + IdGeneratorByThreadLocal.getInstance());

        Thread myThread1 = new Thread(new MyRunnable());
        Thread myThread2 = new Thread(new MyRunnable());
        myThread1.start();
        myThread2.start();
    }

    private static class MyRunnable implements Runnable {


        @Override
        public void run() {
            IdGeneratorByThreadLocal idGenerator = IdGeneratorByThreadLocal.getInstance();
            System.out.println("MyThread thread:" + idGenerator);
        }
    }
}
