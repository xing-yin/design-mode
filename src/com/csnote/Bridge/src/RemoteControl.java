package com.csnote.Bridge.src;

/**
 * RemoteControl 表示遥控器，指代 Abstraction。
 */
public abstract class RemoteControl {

    protected TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();
}
