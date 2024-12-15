package com.itheima.a01threadcase1;

public class ThreadDemo {
    public static void main(String[] args) {
        MyTread myTread1 = new MyTread();
        MyTread myTread2 = new MyTread();

        myTread1.setName("线程1");
        myTread2.setName("线程2");

        myTread1.start();
        myTread2.start();
    }
}
