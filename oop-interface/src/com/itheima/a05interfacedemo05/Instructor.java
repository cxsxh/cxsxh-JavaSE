package com.itheima.a05interfacedemo05;

public abstract class Instructor extends Person{
    public Instructor() {
    }

    public Instructor(String name, int age) {
        super(name, age);
    }

    public abstract void Teach();
}
