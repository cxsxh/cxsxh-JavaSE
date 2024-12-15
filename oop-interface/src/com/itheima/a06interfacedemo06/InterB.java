package com.itheima.a06interfacedemo06;

public interface InterB {
    public default void show(){
        System.out.println("InterB默认方法");
    }
}
