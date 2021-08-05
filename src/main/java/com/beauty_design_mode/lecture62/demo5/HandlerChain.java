package com.beauty_design_mode.lecture62.demo5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alan Yin
 * @date 2021/3/2
 */

public class HandlerChain {

    private List<IHandler> handles = new ArrayList<>();

    public void addHandler(IHandler handle) {
        if (!handles.contains(handle)) {
            handles.add(handle);
        }
    }

    public void handle() {
        for (IHandler handle : handles) {
            handle.handle();
        }
    }
}
