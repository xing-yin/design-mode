package com.chap1.Duck;

import com.chap1.Duck.domain.Duck;
import com.chap1.Duck.domain.MallardDuck;
import com.chap1.Duck.domain.ModelDuck;
import com.chap1.Duck.service.serviceImpl.FlyRocektPowered;

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
