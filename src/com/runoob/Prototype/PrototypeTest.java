package com.runoob.Prototype;

import com.runoob.Prototype.step1.Shape;
import com.runoob.Prototype.step3.ShapeCache;

/**
 * @author yinxing
 * @date 2019/6/25
 */

public class PrototypeTest {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape1 = ShapeCache.getShape("1");
        System.out.println("Shape:" + cloneShape1.getType());

        Shape cloneShape2 = ShapeCache.getShape("2");
        System.out.println("Shape:" + cloneShape2.getType());

        Shape cloneShape3 = ShapeCache.getShape("3");
        System.out.println("Shape:" + cloneShape3.getType());
    }
}
