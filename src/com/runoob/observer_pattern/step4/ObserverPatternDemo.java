package com.runoob.observerPattern.step4;

import com.runoob.observerPattern.step1.Subject;
import com.runoob.observerPattern.step3.BinaryObserver;
import com.runoob.observerPattern.step3.HexaObserver;
import com.runoob.observerPattern.step3.OctalObserver;

/**
 * Created by yinxing on 2018/8/10.
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("First state change:15");
        subject.setState(15);
        System.out.println("Second state change:10");
        subject.setState(10);
    }
}
