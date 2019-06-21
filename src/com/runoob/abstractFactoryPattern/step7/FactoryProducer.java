package com.runoob.abstractFactoryPattern.step7;

import com.runoob.abstractFactoryPattern.step5.AbstractFactory;
import com.runoob.abstractFactoryPattern.step6.ColorFactory;
import com.runoob.abstractFactoryPattern.step6.ShapeFactory;

/**
 * Created by yinxing on 2018/7/31.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
