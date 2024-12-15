package com.itheima.a01myfuction;

import java.util.Arrays;

public class FunctionDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Arrays.sort(arr, FunctionDemo1::subtraction);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int subtraction(int sum1, int sum2) {
        return sum2 - sum1;
    }
}
