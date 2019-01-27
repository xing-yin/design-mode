package com.headfirst.decorator.starbuzzWithSizes;

/**
 * Beverage(饮料)相当于抽象的component类
 * Beverage是一个抽象类
 */
public abstract class Beverage {

    /**
     * 咖啡容量的大小
     */
    public enum Size {
        TALL, GRANDE, VENTI
    }

    ;

    Size size = Size.TALL;
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    /**
     * 所有的调料装饰者都会用到这个方法，所以应该移到抽象类中
     */
    public Size getSize() {
        return this.size;
    }

    /**
     * 需要在子类中实现
     *
     * @return
     */
    public abstract double cost();
}
