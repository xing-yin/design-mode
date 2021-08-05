package com.practice.AbstractFactory.src;

/**
 * @author yinxing
 * @date 2019/6/21
 */

public class ConcreteFactory2 extends AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}
