package com.practice.Prototype.src;

/**
 * @author yinxing
 * @date 2019/6/25
 */

public class ConcreteAbstracProtype2 extends AbstractPrototype {

    private String field;

    public ConcreteAbstracProtype2(String field) {
        this.field = field;
    }

    @Override
    public AbstractPrototype myClone() {
        return new ConcreteAbstracProtype2(field);
    }

    @Override
    public String toString() {
        return field;
    }
}
