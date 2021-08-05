package com.csnote.Prototype.src;

public class Client {

    public static void main(String[] args) {
        AbstractPrototype prototype = new ConcreteAbstractPrototype1("abc");
        AbstractPrototype clone1 = prototype.myClone();
        AbstractPrototype clone2 = prototype.myClone();
        System.out.println(clone1.toString());
        System.out.println(clone2.toString());
        System.out.println(clone2.equals(clone1));
    }
}
