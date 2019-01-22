package com.headfirst.strategy;

/**
 * 设计原则:多用组合，少用继承
 */
public abstract class Duck {
    /**
     * 在Duck类中加入两个实例变量
     * 声明为接口类型，将鸭子的行为搬到接口中去
     * 这些都是行为变化的部分
     */
    FlyBehavior flyBehavior;
    /**
     * 引用实现该接口的对象
     */
    QuackBehavior quackBehavior;

    public Duck() {
    }

    /**
     * 两个set方法来设定鸭子的行为
     *
     * @param fb
     */
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    abstract void display();

    /**
     * 取代原有直接实现的fly()
     */
    public void performFly() {
        //委托给行为类实现
        flyBehavior.fly();
    }

    /**
     * 取代原有直接实现的quack()
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
