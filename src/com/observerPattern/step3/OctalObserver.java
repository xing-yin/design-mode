package com.observerPattern.step3;

import com.observerPattern.step1.Subject;
import com.observerPattern.step2.Observer;

/**
 * Created by yinxing on 2018/8/10.
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String:" + Integer.toOctalString(subject.getState()));
    }
}
