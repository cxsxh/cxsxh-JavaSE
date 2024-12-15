package com.itheima.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        Student.tq = "李焱";
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(20);
        s1.setXb("男");

        s1.xw();
        s1.xx();

        Student s2 = new Student();
        s2.setName("张三");
        s2.setAge(20);
        s2.setXb("男");

        s2.xw();
        s2.xx();
    }
}
