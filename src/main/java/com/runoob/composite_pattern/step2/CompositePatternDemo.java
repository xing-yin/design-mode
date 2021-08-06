package com.runoob.composite_pattern.step2;

/**
 * Created by yinxing on 2018/8/28.
 */

import com.runoob.composite_pattern.step1.Employee;

/**
 * 步骤 2
 * 使用 Employee 类来创建和打印员工的层次结构。
 */
public class CompositePatternDemo {

    public static void main(String[] args) {
        Employee CEO = new Employee("John", "CEO", 300000);

        Employee headSales = new Employee("Tim", "Sales", 20000);
        Employee headMarketing = new Employee("Tom", "Market", 200001);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 10001);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10002);

        Employee marketExecutive1 = new Employee("Jason", "Sales", 10003);
        Employee marketExecutive2 = new Employee("Rose", "Sales", 10004);

        CEO.add(headMarketing);
        CEO.add(headSales);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(marketExecutive1);
        headMarketing.add(marketExecutive2);

        // 打印该组织的所有员工
        System.out.println("CEO:" + CEO);
        for (Employee headEmployee : CEO.getSubOrdinates()) {
            System.out.println("headEmployee:" + headEmployee);
            for (Employee employee : headEmployee.getSubOrdinates()) {
                System.out.println("employee:" + employee);
            }
        }


    }
}
