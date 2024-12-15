package com.itheima.a01interfacedemo01;

public class Rabbit extends Animal{
    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void Eat() {
        System.out.println("吃胡萝卜");
    }
}
