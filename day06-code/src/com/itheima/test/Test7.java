package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 12, 56, 89, 34, 67};
        boolean flag = contains(arr, 89);
        System.out.println(flag);
    }

    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
