package com.facadePattern.step4;

/**
 * Created by yinxing on 2018/8/24.
 */

import com.facadePattern.step3.ShapeMaker;

/**
 * 步骤 4
 * 使用该外观类画出各种类型的形状
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
