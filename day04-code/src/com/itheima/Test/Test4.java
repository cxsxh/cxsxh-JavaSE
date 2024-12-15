package com.itheima.Test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入支付的钱");
        int money = sc.nextInt();
        if (money >= 600) {
            System.out.println("支付成功");
        } else {
            System.out.println("支付失败");
        }
    }
}
