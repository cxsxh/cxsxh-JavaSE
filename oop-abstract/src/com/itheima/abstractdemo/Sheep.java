package com.itheima.abstractdemo;

public class Sheep extends Animal{
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void Eat() {
        System.out.println("吃草");
    }
}
