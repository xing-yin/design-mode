package com.beauty_design_mode.lecture62.demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * HandlerChain 类用数组而非链表来保存所有的处理器，
 * 并且需要在 HandlerChain 的 handle() 函数中，依次调用每个处理器的 handle() 函数。
 *
 * @author Alan Yin
 * @date 2020/3/30
 */

public class HandleChain {

    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        if (!handlers.contains(handler)) {
            handlers.add(handler);
        }
    }

    public void handle() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if (handled) {
                break;
            }
        }
    }
}
