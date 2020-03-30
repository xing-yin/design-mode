package com.beauty_design_mode.lecture62.demo3;


/**
 * @author Alan Yin
 * @date 2020/3/30
 */

public class Application {

    public static void main(String[] args) {
        HandleChain chain = new HandleChain();
        chain.addHandler(new HandleA());
        chain.addHandler(new HandleB());
        chain.handle();
    }
}
