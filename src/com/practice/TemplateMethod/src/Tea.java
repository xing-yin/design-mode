package com.practice.TemplateMethod.src;

/**
 * @author yinxing
 * @date 2019/6/25
 */

public class Tea extends CaffeineBeverage {

    @Override
    protected void addCondiments() {
        System.out.println("4-Tea- addCondiments");
    }

    @Override
    protected void brew() {
        System.out.println("2-Tea-brew");
    }
}
