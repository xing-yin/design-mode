package com.beauty_design_mode.lecture60.demo3;

import com.beauty_design_mode.lecture60.demo3.common.OrderType;

import java.util.HashMap;
import java.util.Map;

/**
 * 如果业务场景不需要每次都创建不同的策略对象，我们可以一开始直接缓存。
 *
 * @author Alan Yin
 * @date 2020/3/24
 */

public class DiscountStrategyFactory {

    private static final Map<OrderType, DiscountStrategy> discountStrategies = new HashMap<>();

    static {
        discountStrategies.put(OrderType.NORMAL, new NormalDiscountStrategy());
        discountStrategies.put(OrderType.GROUPON, new GrouponDiscountStrategy());
        discountStrategies.put(OrderType.PROMOTION, new PromotionDiscountStrategy());
    }

    public static DiscountStrategy getDiscountStrategy(OrderType orderType) {
        if (orderType == null) {
            throw new IllegalArgumentException("OrderType can not be null");
        }
        return discountStrategies.get(orderType);
    }
}
