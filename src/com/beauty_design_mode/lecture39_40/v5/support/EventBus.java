package com.beauty_design_mode.lecture39_40.v5.support;

import com.beauty_design_mode.lecture39_40.v3.model.RequestInfo;
import com.beauty_design_mode.lecture39_40.v5.MetricsCollector;

/**
 * 此处为了不引入额外的包仅做演示，代替 Google EventBus
 *
 * @author Alan Yin
 * @date 2020/10/19
 */

public class EventBus {

    public void register(MetricsCollector.EventListener eventListener) {
    }

    public void post(RequestInfo requestInfo) {
    }
}
