package com.beauty_design_mode.lecture41.example.good;

/**
 * @author Alan Yin
 * @date 2021/1/15
 */

public class OrderController {

    public void createOrder(String order) {
        // 省略业务代码
        Logger.getInstance().log("createOrder:" + order);
    }
}
