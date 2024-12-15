package com.itheima.a04objectdemo;

public class ObjectDemo1 {
    public static void main(String[] args) {
        //toString   返回对象的字符串表示形式
        Object object = new Object();
        String str = object.toString();
        System.out.println(str);

        Student student = new Student();
        String st1 = student.toString();
        System.out.println(st1);
    }
}
