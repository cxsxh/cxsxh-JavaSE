package com.itheima.search;

public class A02_BinarySearchDemo1 {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int number = 81;
        System.out.println(binarySear(arr, number));
    }

    public static int binarySear(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;
        while (true) {
            if (min > max) {
                return -1;
            }

            int mid = (min + max) / 2;
            if (arr[mid] > number) {
                max = mid - 1;
            } else if (arr[mid] < number) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
    }
}
