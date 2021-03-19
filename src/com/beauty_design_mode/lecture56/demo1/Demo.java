package com.beauty_design_mode.lecture56.demo1;

/**
 * @author Alan Yin
 * @date 2021/3/19
 */

public class Demo {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.registerObserver(new ObserverA());
        subject.registerObserver(new ObserverB());
        subject.notifyObservers(new Message());
    }

}
