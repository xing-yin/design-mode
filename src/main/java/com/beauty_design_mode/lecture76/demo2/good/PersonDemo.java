package com.beauty_design_mode.lecture76.demo2.good;

import java.util.Date;

/**
 * @author Alan Yin
 * @date 2020/9/10
 */

public class PersonDemo {

    public static void main(String[] args) {
        Person.Builder builder = new Person.Builder("Jack", "man", new Date(), "xxx@gmail");
        Person person = builder
                .addr("addrxxx")
                .height(180)
                .weight(70)
                .build();
    }
}
