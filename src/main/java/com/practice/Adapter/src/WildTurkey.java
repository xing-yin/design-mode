package com.practice.Adapter.src;

/**
 * @author yinxing
 * @date 2019/6/26
 */

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("WildTurkey gobble");
    }
}
