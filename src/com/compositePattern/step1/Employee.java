package com.compositePattern.step1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yinxing on 2018/8/28.
 */

/**
 * 步骤 1
 * 创建 Employee 类，该类带有 Employee 对象的列表。
 */
public class Employee {

    private String name;
    private String department;
    private int salary;
    private List<Employee> subOrdinates;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        subOrdinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subOrdinates.add(e);
    }

    public void remove(Employee e) {
        subOrdinates.remove(e);
    }

    public List<Employee> getSubOrdinates() {
        return subOrdinates;
    }

    @Override
    public String toString() {
        return ("Emploee:[Name:" + name
                + ",dept:" + department
                + ",salary:" + salary + "]");
    }
}
