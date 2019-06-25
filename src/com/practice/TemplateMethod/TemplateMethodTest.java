package com.practice.TemplateMethod;

import com.practice.TemplateMethod.src.CaffeineBeverage;
import com.practice.TemplateMethod.src.Coffee;
import com.practice.TemplateMethod.src.Tea;

/**
 * @author yinxing
 * @date 2019/6/25
 */

public class TemplateMethodTest {

    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        tea.templateMethod();

        System.out.println("========");

        CaffeineBeverage coffee = new Coffee();
        coffee.templateMethod();
    }
}
