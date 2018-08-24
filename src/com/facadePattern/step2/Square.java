package com.facadePattern.step2;

import com.factoryPattern.step1.Shape;

/**
 * Created by yinxing on 2018/7/30.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square draw() method.");
    }
}
