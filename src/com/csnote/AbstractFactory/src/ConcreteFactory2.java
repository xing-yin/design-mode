package com.csnote.AbstractFactory.src;

public class ConcreteFactory2 extends AbstractFactory {

    @Override
    ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    ProductB createProductB() {
        return new ProductB2();
    }
}
