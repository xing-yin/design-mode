package com.beauty_design_mode.lecture53.demo3;

/**
 * @author Alan Yin
 * @date 2020/8/28
 */

public abstract class HumanResource {

    protected long id;

    protected double salary;

    public HumanResource(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    /**
     * 计算薪资
     *
     * @return
     */
    public abstract double calculateSalary();
}
