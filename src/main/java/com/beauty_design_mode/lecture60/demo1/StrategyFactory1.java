package com.beauty_design_mode.lecture60.demo1;

/**
 * 如果策略类是有状态的，根据业务场景的需要，每次从工厂方法中，获得的都是新创建的策略对象，
 * 而不是缓存好可共享的策略对象，那我们就需要按照如下方式来实现策略工厂类。
 *
 * @author Alan Yin
 * @date 2020/3/24
 */

public class StrategyFactory1 {

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type can not be null");
        }
        if ("A".equals(type)) {
            return new ConcretStrategyA();
        } else if ("B".equals(type)) {
            return new ConcretStrategyB();
        }
        return null;
    }
}
