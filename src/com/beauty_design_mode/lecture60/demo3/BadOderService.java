package com.beauty_design_mode.lecture60.demo3;

import com.beauty_design_mode.lecture60.demo3.common.Order;
import com.beauty_design_mode.lecture60.demo3.common.OrderType;

/**
 * 在这个例子中，我们没有使用策略模式，而是将策略的定义、创建、使用直接耦合在一起。
 *
 * @author Alan Yin
 * @date 2020/3/24
 */

public class BadOderService {

    public double discount(Order order) {
        double discount = 0.0;
        OrderType type = order.getType();
        if (type.equals(OrderType.NORMAL)) {
            // 省略计算折扣的逻辑
        } else if (type.equals(OrderType.GROUPON)) {
            // 省略计算折扣的逻辑
        } else if (type.equals(OrderType.PROMOTION)) {
            // 省略计算折扣的逻辑
        }
        return discount;
    }

}
