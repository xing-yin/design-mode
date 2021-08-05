package com.beauty_design_mode.lecture56.demo2.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Alan Yin
 * @date 2021/3/19
 */

public class MyJob {

    ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        MyJob myJob = new MyJob();
        myJob.runJob();
    }

    public void runJob() {
        long startTime = System.currentTimeMillis();
        System.out.println("start time:" + startTime);
        for (int i = 0; i < 10; i++) {
            // 单线程运行
//            task(i);
            // 多线程运行
            int finalI = i;
            executorService.execute(() -> task(finalI));
        }
        System.out.println("cost time:" + (System.currentTimeMillis() - startTime));
    }

    public void task(int i) {
        System.out.println("begin:" + i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end:" + i);
    }
}
