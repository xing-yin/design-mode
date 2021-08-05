package com.beauty_design_mode.lecture62.demo4;

/**
 * @author Alan Yin
 * @date 2020/3/30
 */

public class Application {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandle(new HandlerA());
        chain.addHandle(new HandlerB());
        chain.addHandle(new HandlerB());
        chain.handle();
    }
}
