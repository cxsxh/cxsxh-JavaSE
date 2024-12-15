package com.itheima.a05threadmethod2;

public class ThreadDemo {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable, "线程1");
        Thread t2 = new Thread(myRunnable, "线程2");

        t1.setPriority(1);
        t2.setPriority(10);

        int priority = t1.getPriority();
        int priority1 = t2.getPriority();
        System.out.println(priority);
        System.out.println(priority1);

        t1.start();
        t2.start();
    }
}
