package com.ithheima.test;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student sd1 = new Student("张三", 23);
        Student sd2 = new Student("李四", 21);
        Student sd3 = new Student("王五", 22);

        list.add(sd1);
        list.add(sd2);
        list.add(sd3);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
        }
    }
}
