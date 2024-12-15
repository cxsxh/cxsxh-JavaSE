package com.itheima.test;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();

        p.brand = "小米";
        p.price = 1999.9;

        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.playGame();

        System.out.println();

        Phone p1 = new Phone();
        p1.brand = "苹果";
        p1.price = 9999;

        System.out.println(p1.brand);
        System.out.println(p1.price);

        p1.call();
        p1.playGame();
    }
}
