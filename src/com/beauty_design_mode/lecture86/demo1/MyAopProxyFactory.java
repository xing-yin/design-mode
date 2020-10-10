package com.beauty_design_mode.lecture86.demo1;

/**
 * 策略模式一般基于工厂模式创建
 *
 * @author Alan Yin
 * @date 2020/9/21
 */

public interface MyAopProxyFactory {

    MyAopProxy createMyAopProxy(AdvisedSupportConfig config);
}
