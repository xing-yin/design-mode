package com.beauty_design_mode.lecture62.demo1;

/**
 * 职责链模式:实现方式1
 * Handler 是所有处理器的抽象父类
 *
 * @author Alan Yin
 * @date 2020/3/30
 */

public abstract class Handler {

    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理方法:如果能够处理请求则处理，不再向下传递；否则，继续由后面处理器处理
     */
    public abstract void handle();

}


/**
 * 上面的代码实现不够优雅：(优化代码见 demo2)
 * 处理器类的 handle() 函数，不仅包含自己的业务逻辑，还包含对下一个处理器的调用，
 * 也就是代码中的 successor.handle()。[如 HandleA]
 * <p>
 * 一个不熟悉这种代码结构的程序员，在添加新的处理器类的时候，
 * 很有可能忘记在 handle() 函数中调用 successor.handle()，这就会导致代码出现 bug。
 */