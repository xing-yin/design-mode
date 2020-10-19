package com.beauty_design_mode.lecture39_40.v5.support;

import com.beauty_design_mode.lecture39_40.v5.support.EventBus;

import java.util.concurrent.ExecutorService;

/**
 * @author Alan Yin
 * @date 2020/10/19
 */

public class AsyncEventBus extends EventBus {

    public AsyncEventBus(ExecutorService executorService) {
        super();
    }
}
