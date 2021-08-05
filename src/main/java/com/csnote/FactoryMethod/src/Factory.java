package com.csnote.FactoryMethod.src;

/**
 * 定义一个抽象类做工厂类
 */
public abstract class Factory {

    /**
     * 该方法是抽象的，需要由子类去实现。
     *
     * @return
     */
    abstract public Product factoryMethod();

    /**
     * Factory 有一个 doSomething() 方法，这个方法需要用到一个产品对象，这个产品对象由 factoryMethod() 方法创建
     */
    public void doSomething() {
        Product product = factoryMethod();
        // do something with the product
    }
}
