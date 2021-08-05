package com.runoob.Prototype.step3;

import com.runoob.Prototype.step1.Shape;
import com.runoob.Prototype.step2.Circle;
import com.runoob.Prototype.step2.Rectangle;
import com.runoob.Prototype.step2.Square;

import java.util.Hashtable;

/**
 * @author yinxing
 * @date 2019/6/25
 */

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
