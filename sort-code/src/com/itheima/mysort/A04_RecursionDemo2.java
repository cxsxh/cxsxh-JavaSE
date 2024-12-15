package com.itheima.mysort;

public class A04_RecursionDemo2 {
    public static void main(String[] args) {
        System.out.println(getFactorialRecursion(5));
    }

    private static int getFactorialRecursion(int number) {
        if (number == 1) {
            return 1;
        }

        return number * getFactorialRecursion(number - 1);
    }

}
