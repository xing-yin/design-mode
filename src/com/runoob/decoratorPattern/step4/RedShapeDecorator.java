package com.runoob.decoratorPattern.step4;

/**
 * Created by yinxing on 2018/8/20.
 */

import com.runoob.decoratorPattern.step1.Shape;
import com.runoob.decoratorPattern.step3.ShapeDecorator;

/**
 * 步骤 4
 * 创建扩展了 ShapeDecorator 类的实体装饰类。
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: RED");
    }
}
