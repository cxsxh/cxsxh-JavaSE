package com.itheima.a07interfacedemo07;

public class InterImpl implements Inter{
    @Override
    public void method() {
        System.out.println("重写抽象类");
    }

    public static void show() {
        System.out.println("InterImpl的静态方法");
    }
}
