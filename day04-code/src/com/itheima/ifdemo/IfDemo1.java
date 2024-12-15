package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入酒量");
        int one = sc.nextInt();

        if (one > 2) {
            System.out.println("不错");
        }
    }
}
