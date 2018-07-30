package com.factoryPattern.step3;

import com.factoryPattern.step1.Shape;
import com.factoryPattern.step2.Circle;
import com.factoryPattern.step2.Rectangle;
import com.factoryPattern.step2.Square;

/**
 * Created by yinxing on 2018/7/30.
 */
public class ShapeFactory {

    // 使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
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
