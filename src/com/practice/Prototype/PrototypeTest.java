package com.practice.Prototype;

import com.practice.Prototype.src.AbstractPrototype;
import com.practice.Prototype.src.ConcreteAbstracProtype1;

/**
 * @author yinxing
 * @date 2019/6/25
 */

public class PrototypeTest {

    public static void main(String[] args) {
        AbstractPrototype abstractPrototype1 = new ConcreteAbstracProtype1("abc");
        AbstractPrototype abstractPrototype11 = abstractPrototype1.myClone();
        // 浅拷贝
        System.out.println("abstractPrototype1 is equals abstractPrototype11: " + abstractPrototype1.equals(abstractPrototype11));
        System.out.println("abstractPrototype11: " + abstractPrototype11);

        AbstractPrototype abstractPrototype2 = new ConcreteAbstracProtype1("efg");
        AbstractPrototype abstractPrototype22 = abstractPrototype2.myClone();
        System.out.println("abstractPrototype22: " + abstractPrototype22);
    }
}
