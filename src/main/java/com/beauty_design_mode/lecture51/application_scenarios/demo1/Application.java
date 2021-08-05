package com.beauty_design_mode.lecture51.application_scenarios.demo1;

/**
 * @author Alan Yin
 * @date 2020/8/13
 */

public class Application {

    public static void main(String[] args) {
        ITarget iTarget = new CDAdaptor();
        iTarget.function1();
        iTarget.function2();
        iTarget.function3(new ParamWrapper());
        iTarget.function4();
    }
}
