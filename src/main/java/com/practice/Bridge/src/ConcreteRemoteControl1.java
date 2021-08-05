package com.practice.Bridge.src;

/**
 * @author yinxing
 * @date 2019/6/26
 */

public class ConcreteRemoteControl1 extends AbstractRemoteControl {

    public ConcreteRemoteControl1(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("ConcreteRemoteControl1 on");
        tv.on();
    }

    @Override
    public void off() {
        System.out.println("ConcreteRemoteControl1 off");
        tv.off();
    }

    @Override
    public void tuneChannel() {
        System.out.println("ConcreteRemoteControl1 tuneChannel");
        tv.tuneChannel();
    }
}
