package com.practice.Prototype.src;

/**
 * @author yinxing
 * @date 2019/6/25
 */

public class ConcreteAbstracProtype1 extends AbstractPrototype {

    private String field;

    public ConcreteAbstracProtype1(String field) {
        this.field = field;
    }

    @Override
    public AbstractPrototype myClone() {
        return new ConcreteAbstracProtype1(field);
    }

    @Override
    public String toString() {
        return field;
    }
}
