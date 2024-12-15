package com.itheima.a06interfacedemo06;

public class Demo implements InterA{
    @Override
    public void method() {
        System.out.println("抽象");
    }

    @Override
    public void show() {
        System.out.println("重写");
    }
}

