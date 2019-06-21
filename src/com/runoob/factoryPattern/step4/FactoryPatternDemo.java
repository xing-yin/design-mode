package com.runoob.factoryPattern.step4;

import com.runoob.factoryPattern.step1.Shape;
import com.runoob.factoryPattern.step3.ShapeFactory;

/**
 * Created by yinxing on 2018/7/30.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // 获取circle对象，并调用他饿的draw方法
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("rectangle");
        shape3.draw();

        try {
            Shape shape4 = shapeFactory.getShape("null");
            System.out.println("when null");
        }catch (Exception e){
            e.getMessage();
            System.out.println("do not execute");
        }
    }
}
