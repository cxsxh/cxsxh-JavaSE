package com.itheima.test;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个正整数");
        int number = sc.nextInt();
        boolean flag = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(number + "是一个质数");
        } else {
            System.out.println(number + "不是一个质数");
        }
    }
}
