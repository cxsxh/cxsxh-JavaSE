package com.itheima.arraydemo;

public class ArrayDemo4 {
    public static void main(String[] args) {
        String[] arr = new String[50];
        arr[0] = "张三";
        arr[1] = "李四";
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);//打印的是默认初始化值null

        //数组默认初始化值的规律
        //整数类型：默认初始化值0
        //小数类型：默认初始化值0.0
        //字符类型：默认初始化值'\u0000' 空格
        //布尔类型：默认初始化值false
        //引用数据类型：默认初始化值 null
        int [] arr1 = new int[10];
        arr1[0] = 1;
        arr1[1] = 2;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
    }
}
