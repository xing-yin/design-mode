package com.csnote.AbstractFactory.src;

public class ConcreteFactory2 extends AbstractFactory {

    @Override
    AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB2();
    }
}
