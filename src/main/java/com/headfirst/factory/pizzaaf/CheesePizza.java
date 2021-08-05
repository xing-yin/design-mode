package com.headfirst.factory.pizzaaf;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    /**
     * 每个披萨从构造器参数中获得具体的工厂。并保存在实例变量中
     *
     * @param ingredientFactory
     */
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        //需要某一种原料，跟工厂要
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
