package com.headfirst.decorator.starbuzz;

public class Mocha extends CondimentDecorator {

	/**
	 * 用一个实例变量记录被装饰者
	 */
	Beverage beverage;

	/**
	 * 通过构造器将被装饰者(作为构造器的参数)被记录到实例变量中
	 * @param beverage
	 */
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		//利用委托的方式得到一个叙述
		return beverage.getDescription() + ", Mocha";
	}

	public double cost() {
		return .20 + beverage.cost();
	}
}
