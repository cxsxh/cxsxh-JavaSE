package com.itheima.a07bigdecimaldemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo3 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("5.0");
        BigDecimal bd2 = new BigDecimal("2.0");

        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);

        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);

        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);

        BigDecimal bd6 = bd1.divide(bd2, 1, RoundingMode.HALF_UP);
        System.out.println(bd6);
    }
}
