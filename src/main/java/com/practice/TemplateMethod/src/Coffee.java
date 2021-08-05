package com.practice.TemplateMethod.src;

/**
 * @author yinxing
 * @date 2019/6/25
 */

public class Coffee extends CaffeineBeverage {

    @Override
    protected void addCondiments() {
        System.out.println("4-Coffee-addCondiments");
    }

    @Override
    protected void brew() {
        System.out.println("2-Coffee-brew");
    }
}
