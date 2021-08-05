package com.beauty_design_mode.lecture76.demo2.good;

import java.util.Date;

/**
 * 好代码的味道:使用Builder模式创建复杂对象
 * <p>
 * Person类的构造方法是私有的: 也就是说，客户端不能直接创建User对象；
 * <p>
 * Person类是不可变的: 所有的属性都被final修饰，在构造方法中设置参数值，并且不对外提供setters方法;
 * <p>
 * Builder模式的高可读性： Builder模式使用了链式调用，可读性更佳。
 * <p>
 * Builder对象与目标对象的异同： Person与Builder拥有共同的属性，并且Builder内部类构造方法中只接收必传的参数，同时只有这些必传的参数使用了final修饰符。
 *
 * @author Alan Yin
 * @date 2020/9/10
 */

public class Person {

    private final String name;    // required
    private final String sex;     // required
    private final Date date;      // required
    private final String email;       // required

    private final int height;     // optional
    private final String edu;     // optional
    private final String nickName;     // optional
    private final int weight;     // optional
    private final String addr;     // optional

    // 私有构造器，因此Person对象的创建必须依赖于Builder
    private Person(Builder builder) {
        this.name = builder.name;
        this.sex = builder.sex;
        this.date = builder.date;
        this.email = builder.email;
        this.height = builder.height;
        this.edu = builder.edu;
        this.nickName = builder.nickName;
        this.weight = builder.weight;
        this.addr = builder.addr;
    }

    public static class Builder {
        private final String name;    // required，使用final修饰
        private final String sex;     // required，使用final修饰
        private final Date date;      // required，使用final修饰
        private final String email;       // required，使用final修饰

        private int height;     // optional，不使用final修饰
        private String edu;     // optional，不使用final修饰
        private String nickName;     // optional，不使用final修饰
        private int weight;     // optional，不使用final修饰
        private String addr;     // optional，不使用final修饰

        public Builder(String name, String sex, Date date, String email) {
            this.name = name;
            this.sex = sex;
            this.date = date;
            this.email = email;
        }

        // 返回Builder对象本身，链式调用
        public Builder height(int height) {
            this.height = height;
            return this;
        }

        // 返回Builder对象本身，链式调用
        public Builder edu(String edu) {
            this.edu = edu;
            return this;
        }

        // 返回Builder对象本身，链式调用
        public Builder nickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        // 返回Builder对象本身，链式调用
        public Builder weight(int weight) {
            this.weight = weight;
            return this;
        }

        // 返回Builder对象本身，链式调用
        public Builder addr(String addr) {
            this.addr = addr;
            return this;
        }

        // 通过Builder构建所需Person对象，并且每次都产生新的Person对象
        public Person build() {
            return new Person(this);
        }

        /**
         * Person对象是不可变的，因此是线程安全的；但是，Builder对象并不具有线程安全性。
         * 因此，当我们需要对Person对象的参数强加约束条件时，我们应该可以对builder()方法中所创建出来的Person对象进行检验，
         * 即我们可以将builder()方法进行如下重写：
         */
//        public Person build(){
//            Person person = new Person(this);
//            if (!"boy".equals(person.sex)){
//                throw new IllegalArgumentException("所注册用户必须为男性！");
//            }else{
//                return person;
//            }
//        }

        /**
         * 需要特别注意的是，我们是对Person对象进行参数检查，而不是对Builder对象进行参数检查，
         * 因为Builder对象不是线程安全的，即下面的代码存在线程安全问题
         */
//        public Person build(){
//            if (!"boy".equals(this.sex)){
//                throw new IllegalArgumentException("所注册用户必须为男性！");
//            }else{
//                return new Person(this);
//            }
//        }
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
