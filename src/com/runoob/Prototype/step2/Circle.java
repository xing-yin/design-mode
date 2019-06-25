package com.runoob.Prototype.step2;

import com.runoob.Prototype.step1.Shape;

/**
 * 创建扩展了上面抽象类的实体类。
 *
 * @author yinxing
 * @date 2019/6/25
 */

public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside draw Circle");
    }
}
