package com.headfirst.decorator.starbuzzWithSizes;

/**
 * 调料抽象类（装饰者类）
 * 扩展自Beverage类，是为了装饰者和被装饰者类型一样
 */
public abstract class CondimentDecorator extends Beverage {

	public Beverage beverage;

	/**
	 * 必须重新实现getDescription()方法
	 * @return
	 */
	public abstract String getDescription();

	public Size getSize() {
		return beverage.getSize();
	}
}
