package com.beauty_design_mode.lecture76.demo2.bad;

import java.util.Date;

/**
 * 坏代码的味道:使用JavaBeans模式创建复杂对象
 * <p>
 * - Setter的存在妨碍了其成为不可变类的可能：这样，在并发环境下，我们就不得不考虑其线程安全性；
 * - 代码丑陋且对象易处于不一致状态：上面创建对象的方式也比较丑陋，同时由于对象的构造过程分为若干个函数调用，所以容易导致对象处于不一致状态。
 *
 * @author Alan Yin
 * @date 2020/9/10
 */

public class Person2 {
    private String name;    // required
    private String sex;     // required
    private Date date;      // required
    private String email;       // required

    private int height;     // optional
    private String edu;     // optional
    private String nickName;     // optional
    private int weight;     // optional
    private String addr;     // optional

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAddr(String addr) {
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