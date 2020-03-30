package com.beauty_design_mode.lecture60.demo3;

import com.beauty_design_mode.lecture60.demo3.common.Order;

/**
 * @author Alan Yin
 * @date 2020/3/24
 */

public class PromotionDiscountStrategy implements DiscountStrategy {

    @Override
    public double calDiscount(Order order) {
        return 8;
    }
}
