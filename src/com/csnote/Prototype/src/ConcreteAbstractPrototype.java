package com.csnote.Prototype.src;

public class ConcreteAbstractPrototype extends AbstractPrototype {

    private String filed;

    public ConcreteAbstractPrototype(String filed) {
        this.filed = filed;
    }

    @Override
    AbstractPrototype myClone() {
        return new ConcreteAbstractPrototype(filed);
    }

    @Override
    public String toString() {
        return filed;
    }
}
