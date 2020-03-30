package com.beauty_design_mode.lecture60.demo3;

import com.beauty_design_mode.lecture60.demo3.common.OrderType;

/**
 * 如果业务场景需要每次都创建不同的策略对象，我们需要每次创建新的实例。
 * 备注:其实这种方式还是用了很多的 if-else 判断，如何优化参见 lecture 61
 *
 * @author Alan Yin
 * @date 2020/3/24
 */

public class DiscountStrategyFactory2 {

    public static DiscountStrategy getDiscountStrategy(OrderType orderType) {
        if (orderType == null) {
            throw new IllegalArgumentException("OrderType can not be null");
        }
        if (OrderType.NORMAL.equals(orderType)) {
            return new NormalDiscountStrategy();
        } else if (OrderType.GROUPON.equals(orderType)) {
            return new GrouponDiscountStrategy();
        } else if (OrderType.PROMOTION.equals(orderType)) {
            return new PromotionDiscountStrategy();
        }
        return null;
    }
}
