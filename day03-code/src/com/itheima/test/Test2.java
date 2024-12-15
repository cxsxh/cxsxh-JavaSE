package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //键盘录入两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入0-10整数");
        int myFashion = sc.nextInt();
        System.out.println("请输入对象0-10整数");
        int girlFashion = sc.nextInt();

        boolean result = myFashion > girlFashion;

        //打印结果
        System.out.println(result);
    }
}
