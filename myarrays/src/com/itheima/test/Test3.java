package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(getSum(10));
    }

    private static int getSum(int number) {
        if (number == 1) {
            return 1;
        } else {
            return (getSum(number - 1) + 1) * 2;
        }
    }
}
