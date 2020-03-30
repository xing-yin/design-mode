package com.beauty_design_mode.lecture62.demo4;

/**
 * @author Alan Yin
 * @date 2020/3/30
 */

public class HandlerChain {

    private Handler head = null;

    private Handler tail = null;

    public void addHandle(Handler handler) {
        handler.setSuccessor(null);
        if (head == null) {
            head = handler;
            tail = handler;
        }

        tail.setSuccessor(handler);
        tail = handler;
    }

    public void handle() {
        if (head != null) {
            head.handle();
        }
    }
}
