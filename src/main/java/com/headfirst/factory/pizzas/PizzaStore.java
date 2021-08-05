package com.headfirst.factory.pizzas;

public class PizzaStore {

    /**
     * 加上简单工厂的引用
     */
    SimplePizzaFactory factory;

    /**
     * 构造器需要工厂作为参数
     *
     * @param factory
     */
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        //将new操作符替换为工厂的创建方法
        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
