package com.csnote.Prototype.src;

/**
 * @author yinxing
 * @date 2019/6/25
 */

public class ConcreteAbstractPrototype2 extends AbstractPrototype {

    private String field;

    public ConcreteAbstractPrototype2(String field) {
        this.field = field;
    }

    @Override
    AbstractPrototype myClone() {
        return new ConcreteAbstractPrototype2(field);
    }

    @Override
    public String toString() {
        return field;
    }
}
