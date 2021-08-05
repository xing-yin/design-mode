package com.runoob.Strategy;

import com.runoob.Strategy.step2.OperationAdd;
import com.runoob.Strategy.step2.OperationMultiply;
import com.runoob.Strategy.step2.OperationSubstract;
import com.runoob.Strategy.step3.Context;

/**
 * @author yinxing
 * @date 2019/9/9
 */

public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context1 = new Context(new OperationAdd());
        System.out.println(context1.excuteStrategy(10,5));

        Context context2 = new Context(new OperationSubstract());
        System.out.println(context2.excuteStrategy(10,5));

        Context context3 = new Context(new OperationMultiply());
        System.out.println(context3.excuteStrategy(10,5));
    }
}
