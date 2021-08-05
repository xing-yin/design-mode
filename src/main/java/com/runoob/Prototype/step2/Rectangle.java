package com.runoob.Prototype.step2;

import com.runoob.Prototype.step1.Shape;

/**
 * @author yinxing
 * @date 2019/6/25
 */

public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside draw Rectangle");
    }

}
