package com.itheima.test;

public class LoopTest1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            //个位 十位 7的倍数
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
