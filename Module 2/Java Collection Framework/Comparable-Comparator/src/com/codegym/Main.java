package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student student = new Student("A", 30, "HT");
        Student student1 = new Student("B", 26, "HT");
        Student student2 = new Student("C", 38, "HT");
        Student student3 = new Student("D", 38, "HT");
        List<Student> lists = new ArrayList<>();
        lists.add(student3);
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sanh theo tuoi: ");
        for (Student st: lists) {
            System.out.println(st.toString());
        }
    }
}
