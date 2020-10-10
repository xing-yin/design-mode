package com.beauty_design_mode.lecture77.demo1;

import java.util.Comparator;

/**
 * @author Alan Yin
 * @date 2020/9/10
 */

public class AgeAscComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }

}
