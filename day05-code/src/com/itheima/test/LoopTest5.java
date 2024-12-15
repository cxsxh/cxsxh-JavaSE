package com.itheima.test;

import java.util.Random;

public class LoopTest5 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            //包头不包尾
            int number = r.nextInt(100);
            System.out.println(number);
        }

    }
}
