package com.itheima.test1;

public class Test {
    public static void main(String[] args) {
        MyThread myTread1 = new MyThread();
        MyThread myTread2 = new MyThread();
        MyThread myTread3 = new MyThread();
        MyThread myTread4 = new MyThread();
        MyThread myTread5 = new MyThread();


        myTread1.setName("张三");
        myTread2.setName("李四");
        myTread3.setName("王五");
        myTread4.setName("赵六");
        myTread5.setName("钱七");

        myTread1.start();
        myTread2.start();
        myTread3.start();
        myTread4.start();
        myTread5.start();
    }
}
