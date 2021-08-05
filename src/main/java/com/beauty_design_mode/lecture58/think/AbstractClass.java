package com.beauty_design_mode.lecture58.think;

/**
 * 假设一个框架中的某个类暴露了两个模板方法，并且定义了一堆供模板方法调用的抽象方法，代码示例如下所示。
 * <p>
 * 在项目开发中，即便我们只用到这个类的其中一个模板方法，我们还是要在子类中把所有的抽象方法都实现一遍，
 * 这相当于无效劳动，有没有其他方式来解决这个问题呢？
 *
 * @author Alan Yin
 * @date 2020/3/23
 */

public abstract class AbstractClass {

    public final void templateMethod1() {
        //...
        method1();
        //...
        method2();
        //...
    }

    public final void templateMethod2() {
        //...
        method3();
        //...
        method4();
        //...
    }

    protected abstract void method1();

    protected abstract void method2();

    protected abstract void method3();

    protected abstract void method4();

    /**
     * 1:如果两个模版方法没有耦合，可以拆分成两个类，如果不能拆分，那就为每个方法提供默认实现
     *
     * 2:父类提供一个默认的抛出异常的实现方法，这样子类必须去实现。
     *
     * 3:在 spring 生命周期中，InstantiationAwareBeanPostProcessorAdapter 就是解决这个问题的。
     * 写个适配器，把所有抽象方法默认实现一下，子类继承这个 adapter 就行了。
     */
}

