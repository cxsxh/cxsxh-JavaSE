package com.itheima.a01staticdemo1;

public class Student {
    private String name;
    private int age;
    private String xb;
    public static String tq;

    public Student() {
    }

    public Student(String name, int age, String xb) {
        this.name = name;
        this.age = age;
        this.xb = xb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public void xw() {
        System.out.println(name + "正在学习");
    }

    public void xx() {
        System.out.println("姓名:" + name + "年龄:" + age + "性别:" + xb + "老师:" + tq);
    }
}
