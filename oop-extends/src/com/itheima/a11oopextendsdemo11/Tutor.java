package com.itheima.a11oopextendsdemo11;

public class Tutor extends Employee{
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    @Override
    public void Work() {
        System.out.println("帮助讲师");
    }
}
