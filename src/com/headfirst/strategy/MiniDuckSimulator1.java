package com.headfirst.strategy;

public class MiniDuckSimulator1 {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        //第一次调用performFly()会被委托给FlyNoWay实例实现，这是在构造器中实现的
        model.performFly();
        //动态设定行为
        model.setFlyBehavior(new FlyRocketPowered());
        //第二次调用performFly()会被委托给FlyRocketPowered实例实现，这是在setter方法中实现的
        model.performFly();

    }
}
