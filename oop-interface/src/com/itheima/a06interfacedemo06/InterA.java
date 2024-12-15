package com.itheima.a06interfacedemo06;

public interface InterA {
    public abstract void method();

    public default void show(){
        System.out.println("InterA默认方法");
    }
}
