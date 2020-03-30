package com.beauty_design_mode.lecture62.apply;

/**
 * @author Alan Yin
 * @date 2020/3/30
 */

public class Application {

    public static void main(String[] args) {
        SensitiveWordFilterChain chain = new SensitiveWordFilterChain();
        // 优势:可以自由组合过滤类
        chain.addFilter(new SexySensitiveWordFilter());
        chain.addFilter(new PoliciticalSensitiveWordFilter());
        boolean legal = chain.filter(new Content());
        if (legal) {
            // pass
        } else {
            // reject
        }
    }
}
