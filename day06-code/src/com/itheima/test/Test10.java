package com.itheima.test;

public class Test10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("调用change放法前" + arr[1]);
              //实参
        change(arr);
        System.out.println("调用change方法后" + arr[1]);
    }

                            //形参
    public static void change(int[] arr) {
        arr[1] = 20;
    }
}
