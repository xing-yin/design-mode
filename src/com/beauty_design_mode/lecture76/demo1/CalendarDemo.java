package com.beauty_design_mode.lecture76.demo1;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Alan Yin
 * @date 2020/9/10
 */

public class CalendarDemo {

    public static void main(String[] args) {
        // 工厂模式使用
        Calendar calendar = Calendar.getInstance();

        // builder 模式使用
        Calendar.Builder builder = new Calendar.Builder();
        Calendar calendar1 = builder
                .setInstant(new Date())
                .setLenient(true)
                .build();
    }
}
