package com.itheima.a03staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("zhangsan", 18, "男");
        Student s2 = new Student("lisi", 19, "女");
        Student s3 = new Student("wangwu", 20, "男");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int Max = StudentUtil.Max(list);

        System.out.println(Max);
    }
}
