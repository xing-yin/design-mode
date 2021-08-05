package com.runoob.abstractFactoryPattern.step6;

import com.runoob.abstractFactoryPattern.step3.Color;
import com.runoob.abstractFactoryPattern.step4.Blue;
import com.runoob.abstractFactoryPattern.step4.Green;
import com.runoob.abstractFactoryPattern.step4.Red;
import com.runoob.abstractFactoryPattern.step5.AbstractFactory;
import com.runoob.factoryPattern.step1.Shape;

/**
 * Created by yinxing on 2018/7/31.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("green")) {
            return new Green();
        } else if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
