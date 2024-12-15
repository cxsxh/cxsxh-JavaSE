package com.itheima.a01jdk7datedemo;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {
        Random r = new Random();
        Date date1 = new Date(Math.abs(r.nextInt()));
        Date date2 = new Date(Math.abs(r.nextInt()));

        long l1 = date1.getTime();
        long l2 = date2.getTime();

        if (l1 > l2) {
            System.out.println("l1 > l2");
        } else if (l1 < l2) {
            System.out.println("l1 < l2");
        }

//        extracted();
    }

    private static void extracted() {
        Date d1 = new Date(0L);
        d1.setTime(1000L * 60 * 60 * 24 * 365);
        System.out.println(d1);
    }
}
