package com.csnote.FactoryMethod.src;

public abstract class Factory {

    abstract public Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        // do something with the product
    }
}
