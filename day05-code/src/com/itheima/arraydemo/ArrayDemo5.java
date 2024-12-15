package com.itheima.arraydemo;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //长度5
        //最小索引0
        //最大索引4
        System.out.println(arr[10]);

        //索引越界异常
        //原因 访问了不存在的索引
        //避免 索引的范围
        //最小 0
        //最大 4(数组长度-1)
    }
}
