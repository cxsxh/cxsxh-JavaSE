package com.itheima.a02systemdemo;

public class SystemDemo {
    public static void main(String[] args) {
        //终止运行的Java虚拟机
        //0：正常终止
        //其他：异常终止
//        System.exit(0);

        //返回当前系统的时间毫秒值形式
        System.out.println(System.currentTimeMillis());

        //数组拷贝
        //arraycopy(数据源数组，起始索引，目的地数组，起始索引，拷贝个数)
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];

        System.arraycopy(arr1, 2, arr2, 0, 3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
