package com.runoob.factoryPattern.step2;

import com.runoob.factoryPattern.step1.Shape;

/**
 * Created by yinxing on 2018/7/30.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
