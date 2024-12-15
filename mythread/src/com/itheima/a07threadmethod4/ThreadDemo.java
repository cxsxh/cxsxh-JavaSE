package com.itheima.a07threadmethod4;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.setName("飞机");
        myThread2.setName("坦克");

        myThread1.start();
        myThread2.start();
    }
}
