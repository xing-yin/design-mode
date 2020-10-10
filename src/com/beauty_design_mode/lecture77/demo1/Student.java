package com.beauty_design_mode.lecture77.demo1;

/**
 * @author Alan Yin
 * @date 2020/9/10
 */

public class Student {

    private String name;

    private Integer age;

    private Float score;

    public Student(String name, Integer age, Float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }
}
