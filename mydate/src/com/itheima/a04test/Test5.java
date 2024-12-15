package com.itheima.a04test;

import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2000, 2, 1);
        c.add(Calendar.DAY_OF_MONTH, -1);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }
}
