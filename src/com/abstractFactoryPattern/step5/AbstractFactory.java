package com.abstractFactoryPattern.step5;

import com.abstractFactoryPattern.step3.Color;
import com.factoryPattern.step1.Shape;

/**
 * Created by yinxing on 2018/7/31.
 */
public abstract class AbstractFactory {

    // 为 Color 和 Shape 对象创建抽象类来获取工厂
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
