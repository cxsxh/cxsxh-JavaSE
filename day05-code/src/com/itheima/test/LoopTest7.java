package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest7 {
    public static void main(String[] args) {

        Random r = new Random();
        int number = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("请输入你要猜的数字");
            int guessNUMBER = sc.nextInt();
            count ++;
            if (count == 3) {
                System.out.println("猜对了");
                break;
            }
            if (guessNUMBER > number) {
                System.out.println("数字大了");
            } else if (guessNUMBER < number) {
                System.out.println("数字小了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
