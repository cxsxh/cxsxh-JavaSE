package com.itheima.myset;

public class HashSetDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 21);
        Student s2 = new Student("张三", 21);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
