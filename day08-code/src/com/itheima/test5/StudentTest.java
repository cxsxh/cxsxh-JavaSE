package com.itheima.test5;

public class StudentTest {
    public static void main(String[] args) {
//        Student s = new Student();
        Student s = new Student("张三", 18);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
