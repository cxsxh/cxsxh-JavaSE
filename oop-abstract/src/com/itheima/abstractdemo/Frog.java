package com.itheima.abstractdemo;

public class Frog extends Animal{
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void Eat() {
        System.out.println("吃虫子");
    }
}
