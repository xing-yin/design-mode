package com.runoob.decoratorPattern.step2;

import com.runoob.decoratorPattern.step1.Shape;

/**
 * 创建实现接口的实体类
 * Created by yinxing on 2018/7/30.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
