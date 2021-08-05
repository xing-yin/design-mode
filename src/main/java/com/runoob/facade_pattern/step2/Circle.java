package com.runoob.facade_pattern.step2;

import com.runoob.facade_pattern.step1.Shape;

/**
 * Created by yinxing on 2018/7/30.
 */

/**
 * 步骤 2
 * 创建实现接口的实体类。
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
