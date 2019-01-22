package com.headfirst.strategy;

public class MallardDuck extends Duck {

    /**
     * MallardDuck在实例化时，它的构造器会把继承来的
     * quackBehavior实例变量初始化成Quack类型的新实例
     */
    public MallardDuck() {
        //绿头鸭使用Quack类处理呱呱叫，所以当performQuack()方法被调用时，
        //叫的职责委托给Quack对象，我们得到了真正的呱呱叫
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();

    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
