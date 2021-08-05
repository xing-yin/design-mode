package com.beauty_design_mode.lecture76.demo2.bad;

import java.util.Date;

/**
 * 坏代码的味道:使用重叠构造器模式创建复杂对象
 * <p>
 * - 灵活性很差：如果客户端只想创建一个给定姓名，性别，生日，邮箱和体重的人，那么他将调用如下构造函数，这样无意中就“被迫”设置了他本不想设置的一些参数。
 * - 代码难以编写与阅读：当属性有很多的时候，代码不但看起来很丑陋，而且极易出错。试想，若客户端不小心颠倒了参数列表中两个参数的顺序 (例如，颠倒了参数“email”和“edu”)，编译器也不会出错，但是在运行时就会出现错误的行为，并且这种错误难以发现。
 *
 * @author Alan Yin
 * @date 2020/9/10
 */

public class Person {

    private String name;    // required
    private String sex;     // required
    private Date date;      // required
    private String email;       // required

    private int height;     // optional
    private String edu;     // optional
    private String nickName;     // optional
    private int weight;     // optional
    private String addr;     // optional

    public Person(String name, String sex, Date date, String email) {
        this(name, sex, date, email, 0);
    }

    public Person(String name, String sex, Date date, String email, int height) {
        this(name, sex, date, email, height, null);
    }

    public Person(String name, String sex, Date date, String email, int height, String edu) {
        this(name, sex, date, email, height, edu, null);
    }

    public Person(String name, String sex, Date date, String email, int height, String edu, String nickName) {
        this(name, sex, date, email, height, edu, nickName, 0);
    }

    public Person(String name, String sex, Date date, String email, int height, String edu, String nickName, int
            weight) {
        this(name, sex, date, email, height, edu, nickName, weight, null);
    }

    public Person(String name, String sex, Date date, String email, int height, String edu, String nickName, int
            weight, String addr) {
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.email = email;
        this.height = height;
        this.edu = edu;
        this.nickName = nickName;
        this.weight = weight;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", date=" + date +
                ", email='" + email + '\'' +
                ", height=" + height +
                ", edu='" + edu + '\'' +
                ", nickName='" + nickName + '\'' +
                ", weight=" + weight +
                ", addr='" + addr + '\'' +
                '}';
    }
}