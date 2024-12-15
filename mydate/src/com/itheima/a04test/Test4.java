package com.itheima.a04test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Test4 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2000, 1, 1);
        LocalDate localDate2 = LocalDate.now();
        long days = ChronoUnit.DAYS.between(localDate, localDate2);
        System.out.println(days);
    }
}
