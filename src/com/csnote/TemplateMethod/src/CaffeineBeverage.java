package com.csnote.TemplateMethod.src;

public abstract class CaffeineBeverage {

    /**
     *
     * 模版方法
     * templateMethod()
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 对于不同的方法，交给子类去实现
     */
    abstract void brew();

    abstract void addCondiments();

    /**
     * 对于公共的方法，父类实现，从而达到复用
     */
    void boilWater() {
        System.out.println("boilWater");
    }

    void pourInCup() {
        System.out.println("pourInCup");
    }
}