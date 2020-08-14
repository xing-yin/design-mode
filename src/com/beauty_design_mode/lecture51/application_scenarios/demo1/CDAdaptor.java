package com.beauty_design_mode.lecture51.application_scenarios.demo1;

/**
 * 适用场景1: 封装有缺陷的接口设计
 * <p>
 * 假设我们依赖的外部系统在接口设计方面有缺陷（比如包含大量静态方法），引入之后会影响到我们自身代码的可测试性。
 * 为了隔离设计上的缺陷，对外部系统提供的接口进行二次封装，抽象出更好的接口设计，可以使用适配器模式。
 *
 * @author Alan Yin
 * @date 2020/8/13
 */

public class CDAdaptor extends CD implements ITarget {

    @Override
    public void function1() {
        CD.staticFunction1();
    }

    @Override
    public void function2() {
        super.uglyNamingFunction2();
    }

    @Override
    public void function3(ParamWrapper paramWrapper) {
        super.tooManyParamsFunction3(paramWrapper.getParamA(), paramWrapper.getParamB(), paramWrapper.getParamC());
    }

    @Override
    public void function4() {
        // 重新实现低性能方法4
    }
}
