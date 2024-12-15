package com.itheima.arraysdemo;

import java.util.Arrays;

public class MyArraysDemo1 {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------------------");

        System.out.println(Arrays.binarySearch(arr, 1));
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 16));

        System.out.println("-----------------------------------------");

        int[] arr1 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arr1));

        System.out.println("-----------------------------------------");

        int[] arr2 = Arrays.copyOfRange(arr, 0, 10);
        System.out.println(Arrays.toString(arr2));

        System.out.println("-----------------------------------------");

        Arrays.fill(arr, 100);
        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------------------");

        int[] arr3= {3, 5, 1, 4, 2, 8, 9, 6, 7, 10};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
