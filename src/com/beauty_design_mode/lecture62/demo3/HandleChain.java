package com.beauty_design_mode.lecture62.demo3;

import java.util.ArrayList;
import java.util.List;

/**
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
