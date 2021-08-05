package com.beauty_design_mode.lecture51.application_scenarios.demo3;

/**
 * 在我们的项目中，外部系统A的使用示例
 *
 * @author Alan Yin
 * @date 2020/8/14
 */

public class Application {

    private IA a;

    public Application(IA a) {
        this.a = a;
    }

    //...

    public static void main(String[] args) {
        // 使用适配器前
        Application application = new Application(new A());

        // 使用适配器后
        // 借助 BAdaptor，Application 的代码中，调用IA接口的地方都无需改动，只需要将BAdaptor如下注入到 Application 即可。
        Application application2 = new Application(new BAdaptor(new B()));
    }
}
