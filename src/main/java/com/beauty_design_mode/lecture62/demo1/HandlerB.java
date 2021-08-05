package com.beauty_design_mode.lecture62.demo1;

/**
 * @author Alan Yin
 * @date 2020/3/30
 */

public class HandlerB extends Handler {

    @Override
    public void handle() {
        boolean isHandle = false;
        // 省略代码
        if (!isHandle && successor != null) {
            System.out.println("HandlerB handle");
            successor.handle();
        }
    }
}
