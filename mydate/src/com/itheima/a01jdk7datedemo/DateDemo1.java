package com.itheima.a01jdk7datedemo;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.setTime(1000L);
        long l1 = d1.getTime();
        System.out.println(l1);
        System.out.println(d1);
    }
}
