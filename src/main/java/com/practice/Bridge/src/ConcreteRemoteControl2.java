package com.practice.Bridge.src;

/**
 * @author yinxing
 * @date 2019/6/28
 */

public class ConcreteRemoteControl2 extends AbstractRemoteControl {

    public ConcreteRemoteControl2(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("ConcreteRemoteControl2 on");
        tv.on();
    }

    @Override
    public void off() {
        System.out.println("ConcreteRemoteControl2 off");
        tv.off();
    }

    @Override
    public void tuneChannel() {
        System.out.println("ConcreteRemoteControl2 tuneChannel");
        tv.tuneChannel();
    }
}
