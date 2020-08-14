package com.beauty_design_mode.lecture62.v2.demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alan Yin
 * @date 2020/8/11
 */

public class HandleChain {

    List<IHandle> handleList = new ArrayList<>();

    public void addHandle(IHandle handle) {
        if (!handleList.contains(handle)) {
            this.handleList.add(handle);
        }
    }

    public void handle() {
        for (IHandle handle : handleList) {
            boolean success = handle.handle();
            if (success) {
                break;
            }
        }
    }
}
