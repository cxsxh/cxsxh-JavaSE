package com.itheima.stringbuilderdemo;

import java.util.Scanner;

public class StringBuilderDemo5 {
    public static void main(String[] args) {
        int len = getString().substring(1).replace("Q", "Z").length();
        System.out.println(len);
    }

    public static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        return str;
    }
}
