package com.runoob.facadePattern.step2;

import com.runoob.factoryPattern.step1.Shape;

/**
 * Created by yinxing on 2018/7/30.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle draw() method.");
    }
}
