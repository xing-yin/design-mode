package com.practice.FactoryMethod.src;

/**
 * @author yinxing
 * @date 2019/6/21
 */

public class Factory1 extends Factory {

    @Override
    public Product factoryMethod() {
        return new Product1();
    }
}
