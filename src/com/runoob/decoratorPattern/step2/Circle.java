package com.runoob.decoratorPattern.step2;

import com.runoob.decoratorPattern.step1.Shape;

/**
 * Created by yinxing on 2018/8/20.
 */

/**
 * 步骤 2
 * 创建实现接口的实体类。
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
