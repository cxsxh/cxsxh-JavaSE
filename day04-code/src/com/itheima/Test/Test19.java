package com.itheima.Test;

public class Test19 {
    public static void main(String[] args) {
        int dividend = 91;
        int divisor = 10;

        //定义以一个变量记录相减了多少次
        int count = 0;
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            count++;
        }
        System.out.println("余数为：" + dividend);
        System.out.println("商为：" + count);
    }
}
