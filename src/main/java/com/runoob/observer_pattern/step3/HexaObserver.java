package com.runoob.observer_pattern.step3;

import com.runoob.observerPattern.step1.Subject;
import com.runoob.observerPattern.step2.Observer;

/**
 * Created by yinxing on 2018/8/10.
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String:" + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
