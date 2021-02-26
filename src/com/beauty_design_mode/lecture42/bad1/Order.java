package com.beauty_design_mode.lecture42.bad1;

import com.beauty_design_mode.lecture41.demo1.IdGenerator;

/**
 * 单例对 OOP 特性的支持不友好
 * <p>
 * 1.对抽象、继承、多态支持得不好
 * 2.违背了基于接口而非实现的设计原则，即违背了 OOP 的抽象特性
 *
 * @author Alan Yin
 * @date 2021/1/17
 */

public class Order {

    public void create() {
        // 省略其他代码
        long id = IdGenerator.getInstance().getId();
        // todo 未来某一天，我们希望针对不同的业务采用不同的 ID 生成算法。比如，订单 ID 和用户 ID 采用不同的 ID 生成器来生成
        // 需要将上面一行代码，替换为下面一行代码
        // long id = OrderIdGenerator.getInstance().getId();
    }
}
