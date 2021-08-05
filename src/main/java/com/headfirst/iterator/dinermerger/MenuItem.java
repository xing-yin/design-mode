package com.headfirst.iterator.dinermerger;

public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;

    /**
     * @param name        菜单名称
     * @param description 描述
     * @param vegetarian  是否为素食
     * @param price       价格
     */
    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String toString() {
        return (name + ", $" + price + "\n   " + description);
    }
}
