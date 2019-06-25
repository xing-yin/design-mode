package com.csnote.Prototype.src;

public class ConcreteAbstractPrototype1 extends AbstractPrototype {

    private String filed;

    public ConcreteAbstractPrototype1(String filed) {
        this.filed = filed;
    }

    @Override
    AbstractPrototype myClone() {
        return new ConcreteAbstractPrototype1(filed);
    }

    @Override
    public String toString() {
        return filed;
    }
}
