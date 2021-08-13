package com.beauty_design_mode.lecture19.demo2.no_di;

/**
 * @author Alan Yin
 * @date 2021/8/13
 */

public class Demo {

    public static void main(String[] args) {
        Notification notification = new Notification();
        notification.sendMessage("6666", "message content");
    }

}
