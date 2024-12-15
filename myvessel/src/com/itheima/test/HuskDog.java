package com.itheima.test;

public class HuskDog extends Dog{
    @Override
    public void Eat() {
        System.out.println("姓名" + getName() + "年龄" + getAge() + "什么都吃");
    }
}
