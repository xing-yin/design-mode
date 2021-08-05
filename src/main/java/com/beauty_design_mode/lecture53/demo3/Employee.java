package com.beauty_design_mode.lecture53.demo3;

/**
 * @author Alan Yin
 * @date 2020/8/28
 */

public class Employee extends HumanResource {

    public Employee(long id, double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
