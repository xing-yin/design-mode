package com.beauty_design_mode.lecture51.application_scenarios.demo3;

/**
 * 适用场景3: 替换依赖的外部系统
 * <p>
 * 将外部系统 A 替换成外部系统 B
 *
 * @author Alan Yin
 * @date 2020/8/14
 */

public class BAdaptor implements IA {

    private B b;

    public BAdaptor(B b) {
        this.b = b;
    }

    @Override
    public void fa() {
        b.fb();
    }
}
