package com.practice.SimpleFactory.src;

/**
 * 模式名:简单工厂模式
 * 背景:全局只需要一个实例
 * 优势：客户类和具体子类的实现解耦
 * 劣势: 适用的场景较简单，无法做更复杂的处理
 * 适用场景：把客户类和具体子类的实现解耦
 * 关键部分:把实例化操作放在简单工厂类中
 * 原理和实现:见代码
 * 同类型的其他实现:对比工厂模式/抽象工厂模式
 *
 * @author yinxing
 * @date 2019/6/20
 */

public class SimpleFactory {

    /**
     * 利用简单工厂创建对象
     *
     * @param type
     * @return
     */
    public static Product createProduct(int type) {
        if (type == 1) {
            return new AProduct();
        } else if (type == 2) {
            return new BProduct();
        } else {
            return new CProduct();
        }
    }

}
