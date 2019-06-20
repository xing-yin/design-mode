package com.runoob.facade_pattern.step3;

/**
 * Created by yinxing on 2018/8/24.
 */

import com.runoob.facade_pattern.step1.Shape;
import com.runoob.facade_pattern.step2.Circle;
import com.runoob.facade_pattern.step2.Rectangle;
import com.runoob.facade_pattern.step2.Square;

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
