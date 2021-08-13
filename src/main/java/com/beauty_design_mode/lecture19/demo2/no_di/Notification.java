package com.beauty_design_mode.lecture19.demo2.no_di;

import com.beauty_design_mode.lecture19.demo2.common.EmailSender;
import com.beauty_design_mode.lecture19.demo2.common.MessageSender;

/**
 * 非依赖注入的实现方式
 *
 * @author Alan Yin
 * @date 2021/8/13
 */

public class Notification {

    private MessageSender messageSender;

    public Notification() {
        // 有点硬编码
        this.messageSender = new EmailSender();
    }

    public void sendMessage(String cellphone, String message) {
        // 省略其他逻辑
        this.messageSender.send(cellphone, message);
    }
}
