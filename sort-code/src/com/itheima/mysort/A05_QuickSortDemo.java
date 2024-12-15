package com.itheima.mysort;

public class A05_QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;

        if (start > end) {
            return;
        }

        int jz = arr[i];

        while (start != end) {
            while (true) {
                if (end <= start || arr[end] < jz) {
                    break;
                }
                end--;
            }

            while (true) {
                if (end <= start || arr[start] > jz) {
                    break;
                }
                start++;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        int temp = arr[start];
        arr[start] = arr[i];
        arr[i] = temp;

        quickSort(arr, start + 1, j);
        quickSort(arr, i, start - 1);
    }
}
