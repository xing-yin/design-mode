package com.beauty_design_mode.lecture62.demo4;

/**
 * 职责链模式变体
 *
 * @author Alan Yin
 * @date 2020/3/30
 */

/**
 * 在 GoF 给出的定义中，如果处理器链上的某个处理器能够处理这个请求，那就不会继续往下传递请求。
 * 实际上，职责链模式还有一种变体，那就是请求会被所有的处理器都处理一遍，不存在中途终止的情况。
 * 这种变体也有两种实现方式：用链表存储处理器和用数组存储处理器（实现与上面类似）。
 */
public abstract class Handler {

    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        doHandle();
        if (successor != null) {
            successor.handle();
        }
    }

    protected abstract void doHandle();

}

