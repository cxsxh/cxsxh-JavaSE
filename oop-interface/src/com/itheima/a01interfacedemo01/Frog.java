package com.itheima.a01interfacedemo01;

public class Frog extends Animal implements Swim{
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void Eat() {
        System.out.println("吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("游泳");
    }
}
