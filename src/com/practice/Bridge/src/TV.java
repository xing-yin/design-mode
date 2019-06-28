package com.practice.Bridge.src;

/**
 * 桥接模式的实现
 * @author yinxing
 * @date 2019/6/26
 */

public interface TV {

    /**
     * 打开
     */
    void on();

    /**
     * 关闭
     */
    void off();

    /**
     * 调频
     */
    void tuneChannel();
}
