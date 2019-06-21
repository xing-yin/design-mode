package com.practice.FactoryMethod.src;

/**
 * 模式名:工厂方法模式
 * 背景:创建对象并将实例化延迟到子类
 * 优势：子类来自行决定实例化的具体实例
 * 劣势: 在对象不复杂的情况下可以直接 new 出来，使用该模式会增加很多额外的类和接口，没有必要
 * 适用场景：创建对象延迟到子类实例化
 * 关键部分:工厂类为抽象类，工厂方法也是抽象，交给子类具体实现
 * 原理和实现:见代码
 * 同类型的其他实现:对比简单工厂模式/抽象工厂模式
 *
 * @author yinxing
 * @date 2019/6/21
 */

public abstract class Factory {

    /**
     * 由子类自己实现
     *
     * @return
     */
    public abstract Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        // 这里可以做一些通用的逻辑处理
    }

}
