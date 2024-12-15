package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
//        compare((byte) 10, (byte) 20);

        byte a1 = 10;
        byte a2 = 20;
        compare(a1, a2);
    }

    public static void compare(byte a1, byte a2) {
        System.out.println("byte");
        System.out.println(a1 == a2);
    }

    public static void compare(short b1, short b2) {
        System.out.println("short");
        System.out.println(b1 == b2);
    }

    public static void compare(int c1, int c2) {
        System.out.println("int");
        System.out.println(c1 == c2);
    }

    public static void compare(long d1, long d2) {
        System.out.println("long");
        System.out.println(d1 == d2);
    }
}
