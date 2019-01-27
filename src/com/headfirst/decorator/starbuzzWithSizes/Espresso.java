package com.headfirst.decorator.starbuzzWithSizes;

public class Espresso extends Beverage {

	/**
	 * 构造器设置饮料的描述
	 */
	public Espresso() {
		description = "Espresso";
	}

	public double cost() {
		return 1.99;
	}
}

