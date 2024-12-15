package com.itheima.test2;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);

        MyThread myThread1 = new MyThread(list);
        MyThread myThread2 = new MyThread(list);

        myThread1.setName("奖池1");
        myThread2.setName("奖池2");

        myThread1.start();
        myThread2.start();
    }
}
