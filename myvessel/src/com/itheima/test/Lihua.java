package com.itheima.test;

public class Lihua extends Cat{
    @Override
    public void Eat() {
        System.out.println("姓名" + getName() + "年龄" + getAge() + "吃猫粮");
    }
}
