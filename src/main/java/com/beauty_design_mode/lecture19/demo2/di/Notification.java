package com.beauty_design_mode.lecture19.demo2.di;

import com.beauty_design_mode.lecture19.demo2.common.MessageSender;

/**
 * 依赖注入的实现方式
 *
 * @author Alan Yin
 * @date 2021/8/13
 */

public class Notification {

    private MessageSender messageSender;

    /**
     * 通过构造函数将 messageSender 传进来,或者通过 setter 方法
     */
    public Notification(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendMessage(String cellphone, String message) {
        // 省略其他逻辑
        this.messageSender.send(cellphone, message);
    }

}
