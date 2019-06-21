package com.csnote.AbstractFactory.src;

public class ConcreteFactory1 extends AbstractFactory {
    @Override
    ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    ProductB createProductB() {
        return new ProductB1();
    }
}
