package com.beauty_design_mode.lecture41.example.bad1;

/**
 * @author Alan Yin
 * @date 2021/1/15
 */

public class OrderController {

    private Logger logger = new Logger();

    public void createOrder(String order) {
        // 省略业务代码
        logger.log("createOrder:" + order);
    }
}
