package com.itheima.mysort;

public class A01_BubbleDemo1 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr.length) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
