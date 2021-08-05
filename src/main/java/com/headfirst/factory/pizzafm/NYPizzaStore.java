package com.headfirst.factory.pizzafm;

public class NYPizzaStore extends PizzaStore {

	/**
	 * 由子类全权负责该实例化哪一个具体的pizza
	 * 该方法必须实现，因为抽象类中该方法也是抽象的
	 * @param item
	 * @return
	 */
	@Override
	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}
