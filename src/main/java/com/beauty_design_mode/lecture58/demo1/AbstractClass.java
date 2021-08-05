package com.beauty_design_mode.lecture58.demo1;

/**
 * 模版方法示例
 *
 * @author Alan Yin
 * @date 2020/3/23
 */

public abstract class AbstractClass {

    public final void templateMethod() {
        // 步骤1
        method1();
        // 步骤2
        method2();
        // 更多...
    }

    protected abstract void method2();

    protected abstract void method1();

    public static void main(String[] args) {
        AbstractClass demo1 = new ConcretClass1();
        demo1.templateMethod();
        AbstractClass demo2 = new ConcretClass2();
        demo2.templateMethod();
    }
}
