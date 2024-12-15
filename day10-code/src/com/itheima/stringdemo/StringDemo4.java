package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        String rightUserName = "zhangsan";
        String rightPassWord = "123456";

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String userName = sc.next();
            System.out.println("请输入密码：");
            String passWord = sc.next();

            if (userName.equals(rightUserName) && passWord.equals(rightPassWord)) {
                System.out.println("用户登录成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("账户" + userName + "已被锁定，请申请找回密码或联系客服");
                } else {
                    System.out.println("用户登录失败，账号或密码有误，您还剩下" + (2 - i) + "次机会");
                }
            }
        }
    }
}
