package com.headfirst.factory.pizzas;

/**
 * 简单工厂
 */
public class SimplePizzaFactory {

    /**
     * 创建
     * 将变化的部分（创建披萨的代码移到新对象中，该对象称为"工厂"）
     * @param type
     * @return
     */
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
