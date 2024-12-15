package com.itheima.a06bigintegerdemo;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        BigInteger bg1 = BigInteger.valueOf(12);
        BigInteger bg2 = BigInteger.valueOf(3);
        BigInteger bgn = BigInteger.valueOf(12);

        BigInteger bg3 = bg1.add(bg2);
        System.out.println(bg3);

        BigInteger bg4 = bg1.subtract(bg2);
        System.out.println(bg4);

        BigInteger bg5 = bg1.multiply(bg2);
        System.out.println(bg5);

        //除法，获取商
        BigInteger bg6 = bg1.divide(bg2);
        System.out.println(bg6);

        //除法获取商和余数
        BigInteger[] bg7 = bg1.divideAndRemainder(bg2);
        for (int i = 0; i < bg7.length; i++) {
            System.out.println(bg7[i]);
        }

        //比较是否相同
        boolean b1 = bg1.equals(bgn);
        System.out.println(b1);

        //次幂
        BigInteger bg8 = bg2.pow(2);
        System.out.println(bg8);

        //返回较大值，较小值
        BigInteger bg9 = bg1.max(bg2);
        BigInteger bg10 = bg1.min(bg2);
        System.out.println(bg9);
        System.out.println(bg10);

        //返回int类型整数，超出范围有误
        int i = bg1.intValue();
        System.out.println(i);
    }
}
