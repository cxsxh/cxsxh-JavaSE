package com.itheima.a05interfacedemo05;

public class BasketballInstructor extends Instructor{
    public BasketballInstructor() {
    }

    public BasketballInstructor(String name, int age) {
        super(name, age);
    }

    @Override
    public void Teach() {
        System.out.println("教打篮球");
    }
}
