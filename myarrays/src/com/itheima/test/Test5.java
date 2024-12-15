package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        System.out.println(getSum(3));
    }

    private static int getSum(int number) {
        if (number == 1) {
            return 1;
        }

        if (number == 2) {
            return 2;
        }

        return getSum(number - 1) + getSum(number - 2);
    }
}
