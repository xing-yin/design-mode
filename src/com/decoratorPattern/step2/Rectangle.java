package com.decoratorPattern.step2;

import com.decoratorPattern.step1.Shape;

/**
 * Created by yinxing on 2018/7/30.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
