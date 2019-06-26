package com.practice.Adapter.src;

/**
 * 模式名:适配器模式
 * 优势：可以将一个已有接口适配成目标接口； 有利于代码复用；灵活性好
 * 劣势: 过多使用会使系统不利于理解(明明是A,实际是B)； Java 只支持单继承，只能适配一次(抽象类)
 * 适用场景：需要将一个接口(已存在接口)转成客户需要的另一个接口
 * 关键部分: 适配器类实现目标接口，依赖旧接口对象
 * 原理和实现:见代码
 *
 * @author yinxing
 * @date 2019/6/26
 */

public class TurkeyApapter implements Duck {

    /**
     * 依赖旧对象
     */
    private Turkey turkey;

    public TurkeyApapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        // 实际调用的还是旧方法
        turkey.gobble();
    }
}
