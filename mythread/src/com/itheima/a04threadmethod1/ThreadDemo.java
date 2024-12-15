package com.itheima.a04threadmethod1;

public class ThreadDemo {
    public static void main(String[] args) {
        MyTread  mt1 = new MyTread("线程1");
        MyTread  mt2 = new MyTread("线程2");

        mt1.start();
        mt2.start();
    }
}
