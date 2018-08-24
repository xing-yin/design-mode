package com.templatePattern.step2;

import com.templatePattern.step1.Game;

/**
 * Created by yinxing on 2018/8/24.
 */
public class Football extends Game {
    @Override
    public void initialize() {
        System.out.println("Football Game Initialized!");
    }

    @Override
    public void startPlay() {
        System.out.println("Football Game Started!");
    }

    @Override
    public void endPlay() {
        System.out.println("Football Game finished!");
    }
}
