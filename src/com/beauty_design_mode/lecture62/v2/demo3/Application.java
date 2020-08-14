package com.beauty_design_mode.lecture62.v2.demo3;

import com.beauty_design_mode.lecture62.demo1.HandlerA;
import com.beauty_design_mode.lecture62.demo1.HandlerB;
import com.beauty_design_mode.lecture62.demo1.HandlerChain;

/**
 * @author Alan Yin
 * @date 2020/8/11
 */

public class Application {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandle(new HandlerA());
        chain.addHandle(new HandlerB());
        chain.handle();
    }
}
