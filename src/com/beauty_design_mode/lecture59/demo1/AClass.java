package com.beauty_design_mode.lecture59.demo1;

/**
 * @author Alan Yin
 * @date 2020/3/23
 */

public class AClass {

    public static void main(String[] args) {
        BClass b = new BClass();
        b.process(new ICallback() {
            @Override
            public void mehthodToCallback() {
                System.out.println("call back me");
            }
        });
    }
}
