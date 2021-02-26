package com.beauty_design_mode.lecture41.example.normal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用类级别的锁
 * <p>
 * 该场景更好地解决方案：使用单例模式
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
        /// todo 解决办法：把对象级别的锁，换成类级别的锁就可以。所有对象共享同一把锁，避免了不同对象同时调用 log() 函数，而导致的日志覆盖问题。
        synchronized (Logger.class) {
            try {
                this.fileWriter.write(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
