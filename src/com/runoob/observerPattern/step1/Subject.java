package com.runoob.observerPattern.step1;

/**
 * Created by yinxing on 2018/8/8.
 */

import com.runoob.observerPattern.step2.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 步骤1:
 * 创建 Subject 类
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 当有变化时通知所有当观察者(update)
     */
    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

}
