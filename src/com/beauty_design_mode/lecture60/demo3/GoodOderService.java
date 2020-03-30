package com.beauty_design_mode.lecture60.demo3;

import com.beauty_design_mode.lecture60.demo3.common.Order;
import com.beauty_design_mode.lecture60.demo3.common.OrderType;

/**
 * @author Alan Yin
 * @date 2020/3/24
 */

public class GoodOderService {

    public double discount(Order order) {
        OrderType orderType = order.getType();
        DiscountStrategy discountStrategy = DiscountStrategyFactory.getDiscountStrategy(orderType);
        return discountStrategy.calDiscount(order);
    }

}
