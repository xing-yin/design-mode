package com.runoob.decoratorPattern.step5;

/**
 * Created by yinxing on 2018/8/21.
 */

import com.runoob.decoratorPattern.step1.Shape;
import com.runoob.decoratorPattern.step2.Circle;
import com.runoob.decoratorPattern.step2.Rectangle;
import com.runoob.decoratorPattern.step4.RedShapeDecorator;

/**
 * 步骤 5
 * 使用 RedShapeDecorator 来装饰 Shape 对象。
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

    }
}
