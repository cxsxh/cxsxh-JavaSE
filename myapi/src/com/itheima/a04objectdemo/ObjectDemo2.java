package com.itheima.a04objectdemo;

public class ObjectDemo2 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 21);
        Student stu2 = new Student("张三", 21);
        boolean flag = stu1.equals(stu2);
        System.out.println(flag);
    }
}
