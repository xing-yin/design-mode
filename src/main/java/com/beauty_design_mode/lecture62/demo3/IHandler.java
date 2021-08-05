package com.beauty_design_mode.lecture62.demo3;

/**
 * 职责链模式:实现方式2（实现更简单）
 * <p>
 * HandlerChain 类用数组而非链表来保存所有的处理器，
 * 并且需要在 HandlerChain 的 handle() 函数中，依次调用每个处理器的 handle() 函数。
 *
 * @author Alan Yin
 * @date 2020/3/30
 */

public interface IHandler {

    boolean handle();
}
