package com.practice.AbstractFactory.src;

/**
 * 模式名:抽象工厂方法模式
 * 背景: 需要提供一个接口，用于创建相关的对象家族
 * 优势：当一个产品族中的多个对象需要一起工作，能保证客户端始终只使用同一个产品族中的对象。
 * 劣势: 产品族扩展困难，如果要增加一个系列的产品，要在抽象创建类和具体实现加代码
 * 适用场景：提供一个接口，用于创建 相关的对象家族
 * 关键部分: 一个工厂里聚合多个同类产品
 * 原理和实现:见代码
 * 同类型的其他实现:对比简单工厂模式/工厂模式
 * 相比于工厂模式创建一个对象，抽象工厂创建的是对象家族(多个对象)
 *
 *
 * 其他说明:
 * - 本示例中 ProductA 和 ProductB 属于不同的产品族接口
 * - 每一个产品族接口有不同的实现(可以理解成同一产品族中不同的产品)
 * - 抽象工厂生产不同产品族的产品使用不同的创建方法
 *
 * @author yinxing
 * @date 2019/6/21
 */

public abstract class AbstractFactory {

    /**
     * 创建不同产品族的产品
     *
     * @return
     */
    public abstract ProductA createProductA();

    public abstract ProductB createProductB();
}
