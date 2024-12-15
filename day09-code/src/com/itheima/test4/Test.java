package com.itheima.test4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //键盘录入：
        //nextInt() 接收整数
        //nextDouble() 接收小数
        //next() 接收字符串
        //遇到空格，制表符，回车就停止，后面的不再接收

        //nextLine
        //接收字符串

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个字符串");

        String num1 = sc.nextLine();

        System.out.println(num1);

        System.out.println("请输入第二个字符串");

        String num2 = sc.nextLine();

        System.out.println(num2);
    }
}
