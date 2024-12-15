package com.itheima.a06bigintegerdemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        Random r = new Random();
        BigInteger bg1 = new BigInteger(4, r);
        System.out.println(bg1);

        BigInteger bg2 = new BigInteger("100000000000000000000000000");
        System.out.println(bg2);

        BigInteger bg3 = new BigInteger("100000000000000000000000000", 10);
        System.out.println(bg3);

        BigInteger bg4 = BigInteger.valueOf(100);
        System.out.println(bg4);
    }
}
