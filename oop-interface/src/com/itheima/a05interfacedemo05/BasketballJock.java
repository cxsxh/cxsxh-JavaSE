package com.itheima.a05interfacedemo05;

public class BasketballJock extends Athlete{
    public BasketballJock() {
    }

    public BasketballJock(String name, int age) {
        super(name, age);
    }

    @Override
    public void Learn() {
        System.out.println("学打篮球");
    }
}
