package com.itheima.assigningoperator;

public class AssigningoperatorDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a += b;
        //等同于 a = (int)(a + b)

        System.out.println(a);
        System.out.println(b);

        short s = 1;

        s += 1;
        //等同于 s += (short)(s + 1)
        System.out.println(s);
    }
}
