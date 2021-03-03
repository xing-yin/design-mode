package com.beauty_design_mode.lecture62.demo5;




/**
 * @author Alan Yin
 * @date 2020/3/30
 */

public class Application {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
