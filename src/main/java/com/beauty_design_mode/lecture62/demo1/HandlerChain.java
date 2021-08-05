package com.beauty_design_mode.lecture62.demo1;

/**
 * HandlerChain 是处理器链：
 * <p>
 * 从数据结构的角度来看，它就是一个记录了链头、链尾的链表。
 * 其中，记录链尾是为了方便添加处理器。
 *
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
