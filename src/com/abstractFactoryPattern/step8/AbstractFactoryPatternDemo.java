package com.abstractFactoryPattern.step8;

import com.abstractFactoryPattern.step3.Color;
import com.abstractFactoryPattern.step5.AbstractFactory;
import com.abstractFactoryPattern.step7.FactoryProducer;
import com.factoryPattern.step1.Shape;

/**
 * Created by yinxing on 2018/7/31.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // 1.获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        // 获取形状为 Circle 的对象
        Shape shape1 = shapeFactory.getShape("circle");
        // 调用 Circle 的 draw 方法
        shape1.draw();

        //获取形状为 Rectangle 的对象
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        //调用 Rectangle 的 draw 方法
        shape2.draw();


        // 2.获取颜色工厂
        AbstractFactory colorFactory= FactoryProducer.getFactory("color");

        //获取颜色为 Red 的对象
        Color color1 = colorFactory.getColor("red");
        //调用 Red 的 fill 方法
        color1.fill();

        Color color2 = colorFactory.getColor("blue");
        color2.fill();


    }
}
