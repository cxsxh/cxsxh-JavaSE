package com.itheima.a02staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        String demo = ArrUtil.printArr(arr1);
        System.out.println(demo);

        double[] arr2 = {1.8, 5.2, 4.8, 6.6, 7.6};
        double vag = ArrUtil.getAverage(arr2);
        System.out.println(vag);
    }
}
