package com.itheima.a01myfuction;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionDemo8 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张大三", 23));
        list.add(new Student("李小四", 24));
        list.add(new Student("王老五" ,25));

        String[] array = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(array));

        Student s1 = new Student("三", 3);
        Student[] arr = {s1};
        System.out.println(Arrays.toString(arr));
    }
}
