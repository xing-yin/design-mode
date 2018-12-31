package com.runoob.Duck;

import com.runoob.Duck.domain.Duck;
import com.runoob.Duck.domain.ModelDuck;
import com.runoob.Duck.service.serviceImpl.FlyRocektPowered;

/**
 * Created by yinxing on 2018/3/10.
 */
public class MiniDuckSimylator {

    public static void main(String[] args) {
        /*Duck mallard=new MallardDuck();
        mallard.performQuack();
        mallard.performFly();*/
        Duck modelDuck=new ModelDuck();
        modelDuck.performFly();
        System.out.println("============");
        modelDuck.setFlyBehavior(new FlyRocektPowered());
        modelDuck.performFly();
    }
}
