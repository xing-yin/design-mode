package com.beauty_design_mode.lecture60.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * 如果策略类是无状态的，不包含成员变量，只是纯粹的算法实现，
 * 这样的策略对象是可以被共享使用的，不需要在每次调用 getStrategy() 的时候，都创建一个新的策略对象。
 *
 * @author Alan Yin
 * @date 2020/3/24
 */

public class StrategyFactory2 {

    private static final Map<String, Strategy> STRATEGIES = new HashMap<>();

    static {
        STRATEGIES.put("A", new ConcretStrategyA());
        STRATEGIES.put("B", new ConcretStrategyB());
    }

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type can not be null");
        }
        return STRATEGIES.get(type);
    }
}
