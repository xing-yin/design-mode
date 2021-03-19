package com.beauty_design_mode.lecture56.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的被观察者
 *
 * @author Alan Yin
 * @date 2021/3/19
 */

public class ConcreteSubject implements Subject {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
