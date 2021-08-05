package com.beauty_design_mode.lecture51.way2;

import com.beauty_design_mode.lecture51.way1.Adaptee;
import com.beauty_design_mode.lecture51.way1.ITarget;

/**
 * 实现方式2: 对象适配器-基于组合
 * <p>
 * 适用场景: 如果 Adaptee 接口很多，而且 Adaptee 和 ITarget 接口定义大部分都不相同，那我们推荐使用对象适配器。
 * 因为组合结构相对于继承更加灵活
 *
 * @author Alan Yin
 * @date 2020/8/13
 */

public class Adaptor implements ITarget {

    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        // 委托给 Adaptee 调用
        adaptee.fa();
    }

    @Override
    public void f2() {
        // 重新实现 f2()
    }

    @Override
    public void fc() {
        // 委托给 Adaptee 调用
        adaptee.fc();
    }
}
