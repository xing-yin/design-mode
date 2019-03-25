package com.csnote.Prototype.src;

public class Client {

    public static void main(String[] args) {
        AbstractPrototype prototype = new ConcreteAbstractPrototype("abc");
        AbstractPrototype clone = prototype.myClone();
        System.out.println(clone.toString());
    }
}
