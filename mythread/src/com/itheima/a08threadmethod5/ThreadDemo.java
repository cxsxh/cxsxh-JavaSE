package com.itheima.a08threadmethod5;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.setName("Hang");
        myThread.start();

        myThread.join();

        for (int i = 0; i < 10; i++) {
            System.out.println("main");
        }
    }
}
