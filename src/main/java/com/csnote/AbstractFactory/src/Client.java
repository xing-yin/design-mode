package com.csnote.AbstractFactory.src;

public class Client {

    public static void main(String[] args) {

        AbstractFactory abstractFactory = new ConcreteFactory1();

        ProductA productA = abstractFactory.createProductA();
        ProductB productB = abstractFactory.createProductB();

        // do something with productA and productB
    }
}
