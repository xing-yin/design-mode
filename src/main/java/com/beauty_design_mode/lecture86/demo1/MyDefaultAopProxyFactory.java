package com.beauty_design_mode.lecture86.demo1;

import java.lang.reflect.Proxy;

/**
 * @author Alan Yin
 * @date 2020/9/21
 */

public class MyDefaultAopProxyFactory implements MyAopProxyFactory {

    @Override
    public MyAopProxy createMyAopProxy(AdvisedSupportConfig config) {
        // 策略选择
        boolean conditionA = true;
        if (conditionA) {
            // return new ObjenesisCglibAopProxy(config);
        } else {
            // return new JdkDynamicAopProxy(config);
        }
        return null;
    }
}
