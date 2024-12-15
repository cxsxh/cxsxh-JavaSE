package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        System.out.println(getSum(1));
    }

    private static int getSum(int number) {
        if (number == 10) {
            return 1;
        } else {
            return (getSum(number + 1) + 1) * 2;
        }
    }
}
