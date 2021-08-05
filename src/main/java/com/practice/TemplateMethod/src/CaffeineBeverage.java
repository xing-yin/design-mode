package com.practice.TemplateMethod.src;

/**
 * 模式名:模版方法模式
 * 优势：封装不变的部分，扩展可变部分; 提供公共代码，便于维护； 行为由父类控制，子类实现
 * 劣势: 每一个不同的实现都需要子类实现，导致类数量增加，系统庞大
 * 适用场景：多个子类有共同的方法，且逻辑相同； 重要复杂的方法可以考虑采用
 * 关键部分: 在抽象类实现公共方法，其他在子类实现；  模版方法用 final 修饰
 * 原理和实现:见代码
 *
 * @author yinxing
 * @date 2019/6/25
 */

public abstract class CaffeineBeverage {

    public final void templateMethod() {
        boilWater();
        // 泡/沏
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 公共方法(公共实现)
     */
    private void boilWater() {
        System.out.println("1 - boilWater");
    }

    private void pourInCup() {
        System.out.println("3 - pourInCup");
    }

    /**
     * 特殊方法(子类实现)
     */
    protected abstract void addCondiments();

    protected abstract void brew();

}
