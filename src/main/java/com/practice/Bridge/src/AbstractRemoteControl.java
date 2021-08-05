package com.practice.Bridge.src;

/**
 * 桥接模式的抽象
 *
 * @author yinxing
 * @date 2019/6/26
 */

public abstract class AbstractRemoteControl {

    /**
     * 抽象依赖实现
     */
    protected TV tv;

    public AbstractRemoteControl(TV tv) {
        this.tv = tv;
    }

    /**
     * 交给子类实现
     */
    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();

}
