package com.beauty_design_mode.lecture56.demo1;

/**
 * @author Alan Yin
 * @date 2021/3/19
 */

public class ObserverB implements Observer{
    @Override
    public void update(Message message) {
        System.out.println("ObserverB is notified.");
    }
}
