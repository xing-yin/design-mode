package com.beauty_design_mode.lecture60.demo2;

import com.beauty_design_mode.lecture60.demo1.ConcretStrategyA;
import com.beauty_design_mode.lecture60.demo1.ConcretStrategyB;
import com.beauty_design_mode.lecture60.demo1.Strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 如果策略类是无状态的，不包含成员变量，只是纯粹的算法实现，
 * 这样的策略对象是可以被共享使用的，不需要在每次调用 getStrategy() 的时候，都创建一个新的策略对象。
 *
 * @author Alan Yin
 * @date 2020/3/24
 */

public class EvictionStrategyFactory {

    private static final Map<String, EvictionStrategy> strategies = new HashMap<>();

    static {
        strategies.put("A", new LruEvictionStrategy());
        strategies.put("B", new FifoEvictionStrategy());
    }

    public static EvictionStrategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type can not be null");
        }
        return strategies.get(type);
    }
}
