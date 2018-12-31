package com.runoob.templatePattern.step2;


import com.runoob.templatePattern.step1.Game;

/**
 * Created by yinxing on 2018/8/24.
 */

/**
 * 步骤 2
 * 创建扩展了上述类的实体类。
 */
public class Cricket extends Game {

    @Override
    public void initialize() {
        System.out.println("Cricket Game Initialized!");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket Game Started!");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
