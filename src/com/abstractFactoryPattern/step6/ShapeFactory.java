package com.abstractFactoryPattern.step6;

import com.abstractFactoryPattern.step3.Color;
import com.abstractFactoryPattern.step5.AbstractFactory;
import com.factoryPattern.step1.Shape;
import com.factoryPattern.step2.Circle;
import com.factoryPattern.step2.Rectangle;
import com.factoryPattern.step2.Square;

/**
 * Created by yinxing on 2018/7/31.
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if (shapeType.contentEquals("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
