package com.itheima.test;

public class ArrTest1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            //i 依次表示数组里每一个索引
            //arr [i]依次表示数组里的每一个元素
            sum = sum +arr[i];
        }

        System.out.println(sum);
    }
}
