package com.itheima.myreflect4;

public class Student {
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    private String sleep(String s) throws ClassNotFoundException, NoSuchMethodException {
        System.out.println("想" + s);
        return "null";
    }

    public void show() {
        System.out.println("show");
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
