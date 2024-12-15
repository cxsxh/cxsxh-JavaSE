package com.itheima.lambdademo;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 9};
        Arrays.sort(arr, (Integer o1, Integer o2)-> {
                return o1 - o2;
            }
        );

        System.out.println(Arrays.toString(arr));
    }
}
