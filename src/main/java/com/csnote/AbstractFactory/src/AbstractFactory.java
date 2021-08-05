package com.csnote.AbstractFactory.src;

/**
 * 抽象工厂模式用到了工厂方法模式来创建单一对象，
 * AbstractFactory 中的 createProductA() 和 createProductB() 方法都是让子类来实现，
 * 这两个方法单独来看就是在创建一个对象，这符合工厂方法模式的定义。
 */
public abstract class AbstractFactory {

    abstract ProductA createProductA();

    abstract ProductB createProductB();
}
