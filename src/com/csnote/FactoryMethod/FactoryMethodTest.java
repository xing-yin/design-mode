package com.csnote.FactoryMethod;

import com.csnote.FactoryMethod.src.*;

/**
 * @author yinxing
 * @date 2019/6/21
 */

public class FactoryMethodTest {

    public static void main(String[] args) {

        Factory factory1 = new ConcreteFactory1();
        Factory factory2 = new ConcreteFactory2();
        Factory factory3 = new ConcreteFactory3();

        Product product1 = factory1.factoryMethod();
        Product product2 = factory2.factoryMethod();
        Product product3 = factory3.factoryMethod();

        System.out.println(product1.getClass().getName());
        System.out.println(product2.getClass().getName());
        System.out.println(product3.getClass().getName());

    }
}
