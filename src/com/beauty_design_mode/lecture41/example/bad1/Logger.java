package com.beauty_design_mode.lecture41.example.bad1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 问题：存在日志覆盖问题
 * <p>
 * 所有的日志写入到同一个文件 user_absolute_ath/log.txt（共享资源） 中。
 * 在 UserController 和 OrderController 中，分别创建两个 Logger 对象。
 * 在 Web 容器的 Servlet 多线程环境下，如果两个 Servlet 线程同时分别执行 login() 和 create() 两个函数，
 * 并且同时写日志到 log.txt 文件中，那就有可能存在日志信息互相覆盖的情况
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
        try {
            this.fileWriter.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
