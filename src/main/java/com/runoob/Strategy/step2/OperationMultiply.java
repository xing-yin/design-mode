package com.runoob.Strategy.step2;

import com.runoob.Strategy.step1.Strategy;

/**
 * @author yinxing
 * @date 2019/9/9
 */

public class OperationMultiply implements Strategy{

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
