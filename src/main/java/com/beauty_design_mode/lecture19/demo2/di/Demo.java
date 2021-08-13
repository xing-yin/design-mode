package com.beauty_design_mode.lecture19.demo2.di;

import com.beauty_design_mode.lecture19.demo2.common.EmailSender;
import com.beauty_design_mode.lecture19.demo2.common.MessageSender;

/**
 * @author Alan Yin
 * @date 2021/8/13
 */

public class Demo {

    public static void main(String[] args) {
        // 创建对象
        MessageSender messageSender = new EmailSender();
        //依赖注入
        Notification notification = new Notification(messageSender);
        notification.sendMessage("6666", "message content");
    }

}
