package com.itheima.Test;

public class Test18 {
    public static void main(String[] args) {
        int x = 12345;
        //定义一个临时的变量记录x原来的值,用于最后进行比较
        int temp = x;
        int num = 0;
        while (x != 0) {
            //从右往左获取每一位数字
            int ge = x % 10;
            //修改一下x记录的值
            x = x / 10;
            //把当前获取到的数字拼接到最右边
            num = num * 10 + ge;
        }
        System.out.println(num);
        System.out.println(x);//0
        System.out.println(num == temp);
    }
}
