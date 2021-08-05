package com.headfirst.factory.pizzas;

import java.util.ArrayList;

public abstract class Pizza {
    /**
     * 名称
     */
    String name;
    /**
     * 面团类型
     */
    String dough;
    /**
     * 酱料类型
     */
    String sauce;
    /**
     * 一套佐料
     */
    ArrayList<String> toppings = new ArrayList<String>();

    public String getName() {
        return name;
    }

    /**
     * 准备
     */
    public void prepare() {
        System.out.println("Preparing " + name);
    }

    /**
     * 烘焙
     */
    public void bake() {
        System.out.println("Baking " + name);
    }

    /**
     * 切片
     */
    public void cut() {
        System.out.println("Cutting " + name);
    }

    /**
     * 装盒
     */
    public void box() {
        System.out.println("Boxing " + name);
    }

    @Override
    public String toString() {
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}

