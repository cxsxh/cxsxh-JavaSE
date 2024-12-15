package com.itheima.a07interfacedemo07;

public class Test {
    public static void main(String[] args) {
        InterImpl ii = new InterImpl();
        ii.method();

        Inter.show();

        InterImpl.show();
    }
}
