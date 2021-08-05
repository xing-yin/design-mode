package com.beauty_design_mode.lecture42.bad2;

/**
 * 单例对象里的值既可以像下面的代码那样通过静态常量( ConfigClass )来定义，也可以从配置文件中加载得到(最值得推荐)。
 *
 * @author Alan Yin
 * @date 2021/1/17
 */

public class BetterSingleton {

    private static BetterSingleton instance = null;

    private final int paramA;
    private final int paramB;

    private BetterSingleton() {
        this.paramA = ConfigClass.PARAM_A;
        this.paramB = ConfigClass.PARAM_B;
    }

    public synchronized BetterSingleton getInstance() {
        if (instance == null) {
            return new BetterSingleton();
        }
        return instance;
    }


}
