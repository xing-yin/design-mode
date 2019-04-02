package com.csnote.Observer.src;

/**
 * 观察者（Observer）的注册功能需要调用主题的 registerObserver() 方法
 */
public interface Observer {

    void update(float temp, float humidity, float pressure);

}