package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        System.out.println(getSum(20));
    }

    private static int getSum(int number) {
        if (number == 1) {
            return 1;
        }

        if (number == 2) {
            return 2;
        }

        if (number == 3) {
            return 4;
        }

        return getSum(number - 1) + getSum(number -2) + getSum(number - 3);
    }
}
