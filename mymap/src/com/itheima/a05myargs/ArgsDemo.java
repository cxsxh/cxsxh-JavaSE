package com.itheima.a05myargs;

public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(ag(1,2,3,4,5,6,7,8,9,10));
    }

    public static int ag(int...args) {
        int sum = 0;
        for (int i : args) {
            sum = sum + i;
        }
        return sum;
    }
}
