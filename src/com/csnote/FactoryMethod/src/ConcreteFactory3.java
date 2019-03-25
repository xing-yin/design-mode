package com.csnote.FactoryMethod.src;

public class ConcreteFactory3 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct3();
    }
}
