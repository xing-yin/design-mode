package com.beauty_design_mode.lecture56.demo1;

/**
 * 具体的观察者 A
 *
 * @author Alan Yin
 * @date 2021/3/19
 */

public class ObserverA implements Observer {

    @Override
    public void update(Message message) {
        //TODO: 获取消息通知，执行自己的逻辑
        System.out.println("ObserverA is notified.");
    }
}
