package com.beauty_design_mode.lecture51.way1;

/**
 * 实现方式1: 类适配器-基于继承
 * <p>
 * 适用场景:如果 Adaptee 接口很多，而且 Adaptee 和 ITarget 接口定义大部分都相同，那我们推荐使用类适配器。
 * 因为 Adaptor 复用父类 Adaptee 的接口，比起对象适配器的实现方式，Adaptor 的代码量要少一些。
 *
 * @author Alan Yin
 * @date 2020/8/13
 */

public class Adaptor extends Adaptee implements ITarget {

    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        // 重新实现 f2()
    }

    // todo：这里fc()不需要实现，直接继承自 Adaptee，这是跟对象适配器最大的不同点
}
