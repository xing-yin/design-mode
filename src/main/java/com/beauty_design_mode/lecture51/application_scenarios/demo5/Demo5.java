package com.beauty_design_mode.lecture51.application_scenarios.demo5;

import java.util.Arrays;
import java.util.List;

/**
 * 适用场景5: 适配器模式主要用于接口的适配，实际上，它还可以用在不同格式的数据之间的适配
 *
 * @author Alan Yin
 * @date 2020/8/14
 */

public class Demo5 {

    void example() {
        // 如 Arrays.asList() 也可以看作一种数据适配器，将数组类型的数据转化为集合容器类型
        List<String> stringList = Arrays.asList("Alan", "Bob");
    }
}
