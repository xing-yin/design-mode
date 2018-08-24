package com.facadePattern.step3;

/**
 * Created by yinxing on 2018/8/24.
 */

import com.factoryPattern.step1.Shape;
import com.factoryPattern.step2.Circle;
import com.factoryPattern.step2.Rectangle;
import com.factoryPattern.step2.Square;

/**
 * 步骤 3
 * 创建一个外观类。
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
