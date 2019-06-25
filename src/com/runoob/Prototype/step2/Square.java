package com.runoob.Prototype.step2;

import com.runoob.Prototype.step1.Shape;

/**
 * @author yinxing
 * @date 2019/6/25
 */

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside draw Square");
    }
}
