package com.decoratorPattern.step3;

/**
 * Created by yinxing on 2018/8/20.
 */

import com.decoratorPattern.step1.Shape;

/**
 * 步骤 3
 * 创建实现了 Shape 接口的抽象装饰类。
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }

}
