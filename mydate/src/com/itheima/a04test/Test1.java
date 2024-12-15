package com.itheima.a04test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            if (num < 1 || num > 200) {
                System.out.println("数字不在范围，请重新输入");
                continue;
            }
            list.add(num);
            int sum = getSum(list);
            if (sum > 200) {
                System.out.println("数字已经到达200");
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            sum = sum + num;
        }
        return sum;
    }
}
