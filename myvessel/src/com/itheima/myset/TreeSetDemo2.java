package com.itheima.myset;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 21);
        Student s3 = new Student("wangwu", 22);

        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        System.out.println(ts);
    }
}
