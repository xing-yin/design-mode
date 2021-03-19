package com.beauty_design_mode.lecture56.demo1;

/**
 * 最经典的观察者模式实现方式
 *
 * @author Alan Yin
 * @date 2021/3/19
 */

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(Message message);
}
