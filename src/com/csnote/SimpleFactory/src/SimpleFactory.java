package com.csnote.SimpleFactory.src;

/**
 * 在创建一个对象时不向客户暴露内部细节，并提供一个创建对象的通用接口
 */
public class SimpleFactory {

    public Product createProduct(int type) {
        if (type == 1) {
            return new ConcreteProduct1();
        } else if (type == 2) {
            return new ConcreteProduct2();
        }
        return new ConcreteProduct3();
    }
}
