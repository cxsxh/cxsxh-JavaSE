package com.itheima.a02threadcase2;

public class MyTread {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();

        Thread t1 = new Thread(myRun);
        Thread t2 = new Thread(myRun);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
