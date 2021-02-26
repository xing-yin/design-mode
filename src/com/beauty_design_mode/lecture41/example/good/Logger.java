package com.beauty_design_mode.lecture41.example.good;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 好的解决方式:使用单例模式
 *
 * @author Alan Yin
 * @date 2021/1/15
 */

public class Logger {

    private FileWriter fileWriter;

    private static final Logger LOGGER = new Logger();

    private Logger() {
        File file = new File("user_absolute_ath/log.txt");
        try {
            // true 表示追加写入
            this.fileWriter = new FileWriter(file, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        return LOGGER;
    }

    public void log(String message) {
        try {
            fileWriter.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
