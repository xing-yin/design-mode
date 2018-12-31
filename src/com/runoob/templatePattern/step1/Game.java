package com.runoob.templatePattern.step1;

/**
 * Created by yinxing on 2018/8/24.
 */

/**
 * 步骤 1
 * 创建一个抽象类，它的模板方法被设置为 final。
 */
public abstract class Game {

    public abstract void initialize();

    public abstract void startPlay();

    public abstract void endPlay();

    //模板方法
    public final void play() {

        // 初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
