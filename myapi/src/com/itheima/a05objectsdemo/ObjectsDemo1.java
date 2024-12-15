package com.itheima.a05objectsdemo;

import com.itheima.a04objectdemo.Student;

import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {
        Student student1 = new Student("张三", 22);
        Student student2 = new Student("张三", 22);

        //先做非空判断再比较
        boolean flag = Objects.equals(student1, student2);
        System.out.println(flag);
    }
}
