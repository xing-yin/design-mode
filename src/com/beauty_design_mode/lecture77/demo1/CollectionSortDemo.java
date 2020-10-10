package com.beauty_design_mode.lecture77.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Alan Yin
 * @date 2020/9/10
 */

public class CollectionSortDemo {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 19, 89.0f));
        students.add(new Student("Peter", 20, 78.0f));
        students.add(new Student("Leo", 18, 99.0f));

        Collections.sort(students, new NameAscComparator());
        println(students);

        Collections.sort(students, new AgeAscComparator());
        println(students);

        Collections.sort(students, new ScoreDescComparator());
        println(students);

        List<Integer> list = Arrays.asList(3, 2, 1);
        Collections.sort(list);
        System.out.println(list);
    }

    private static void println(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.getName() + ":" + student.getAge() + ":" + student.getScore());
        }
        System.out.println("-----------");
    }
}
