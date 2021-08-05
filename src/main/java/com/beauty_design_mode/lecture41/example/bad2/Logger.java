package com.beauty_design_mode.lecture41.example.bad2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 问题：这种锁是一个对象级别的锁，一个对象在不同的线程下同时调用 log() 函数，会被强制要求顺序执行。
 * 但不同的对象之间并不共享同一把锁。在不同的线程下，通过不同的对象调用执行 log() 函数，锁并不会起作用，仍然可能写入日志互相覆盖。
 * <p>
 *
 * @author Alan Yin
 * @date 2021/1/15
 */

public class Logger {

    private FileWriter fileWriter;

    public Logger() {
        File file = new File("user_absolute_ath/log.txt");
        try {
            // true 表示追加写入
            this.fileWriter = new FileWriter(file, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void log(String message) {
        /// todo "貌似正确的解决办法"：给 log() 函数加互斥锁，同一时刻只允许一个线程调用执行
        synchronized (this) {
            try {
                this.fileWriter.write(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
