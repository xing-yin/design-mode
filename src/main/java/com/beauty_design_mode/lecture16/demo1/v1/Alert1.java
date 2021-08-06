package com.beauty_design_mode.lecture16.demo1.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 3.使用 handler 的方式处理
 * 开闭原则：正面例子
 * <p>
 * // 代码未改动
 *
 * @author Alan Yin
 * @date 2021/8/6
 */

public class Alert1 {

    List<AlertHandler> alertHandlers = new ArrayList<>();

    public void addAlertHandler(AlertHandler alertHandler) {
        alertHandlers.add(alertHandler);
    }

    public void check(ApiStatInfo apiStatInfo) {
        for (AlertHandler handler : alertHandlers) {
            handler.check(apiStatInfo);
        }
    }

}
