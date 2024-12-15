package com.itheima.a01myexception;

public class GirFriend {
    private String name;
    private int age;


    public GirFriend() {
    }

    public GirFriend(String name, int age) {
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
        int len = name.length();
        if (len < 3 || len > 10) {
            throw new Name();
        }
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
        if (age < 16 || age > 40) {
            throw new Age();
        }
        this.age = age;
    }

    public String toString() {
        return "GirFriend{name = " + name + ", age = " + age + "}";
    }
}
