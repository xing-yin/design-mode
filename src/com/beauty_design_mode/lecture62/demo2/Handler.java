package com.beauty_design_mode.lecture62.demo2;

/**
 * 职责链模式:实现方式1(优化后,HandleChain 和 Application 不变)
 *
 * @author Alan Yin
 * @date 2020/3/30
 */

public abstract class Handler {

    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        boolean isHandle = doHandle();
        if (successor != null && !isHandle) {
            successor.handle();
        }
    }

    protected abstract boolean doHandle();
}
