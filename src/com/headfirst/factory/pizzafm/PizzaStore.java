package com.headfirst.factory.pizzafm;

/**
 * 定义成抽象类
 */
public abstract class PizzaStore {

    /**
     * 工厂方法：由子类实现
     * @param item
     * @return
     */
    abstract Pizza createPizza(String item);

    /**
     * 工厂方法将客户与实际创建具体产品的代码分隔开来
     * orderPizza并不知道真正创建的是哪一种实例
     * @param type
     * @return
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
