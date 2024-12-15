package com.itheima.a06threadmethod3;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        myThread1.setName("女神");
        myThread2.setName("备胎");

        myThread1.setPriority(10);
        myThread2.setPriority(1);

        myThread2.setDaemon(true);

        myThread1.start();
        myThread2.start();
    }
}
