package com.itheima.a07bigdecimaldemo;

import java.math.BigDecimal;

public class BigDecimalDemo2 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("0.9");
        BigDecimal bd2 = new BigDecimal("0.91");
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);

        BigDecimal bd4 = BigDecimal.valueOf(10);
        BigDecimal bd5 = BigDecimal.valueOf(10);
        System.out.println(bd4);
    }
}
