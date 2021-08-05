package com.practice.AbstractFactory;

import com.practice.AbstractFactory.src.*;

/**
 * @author yinxing
 * @date 2019/6/21
 */

public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory abstractFactory1 = new ConcreteFactory1();
        ProductA productA1 = abstractFactory1.createProductA();
        ProductB productB1 = abstractFactory1.createProductB();

        System.out.println("ConcreteFactory1=====");
        System.out.println(productA1.getClass().getSimpleName());
        System.out.println(productB1.getClass().getSimpleName());

        AbstractFactory abstractFactory2 = new ConcreteFactory2();
        ProductA productA2 = abstractFactory2.createProductA();
        ProductB productB2 = abstractFactory2.createProductB();

        System.out.println("ConcreteFactory2=====");
        System.out.println(productA2.getClass().getSimpleName());
        System.out.println(productB2.getClass().getSimpleName());

    }
}
