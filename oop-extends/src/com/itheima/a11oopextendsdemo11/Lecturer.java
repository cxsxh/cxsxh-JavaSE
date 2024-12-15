package com.itheima.a11oopextendsdemo11;

public class Lecturer extends Employee{
    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }

    @Override
    public void Work() {
        System.out.println("讲课");
    }
}
