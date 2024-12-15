package com.itheima.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A03_SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date1 = new Date(0L);
        String str1 = sdf.format(date1);
        System.out.println(str1);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str2 = sdf2.format(date1);
        System.out.println(str2);

        String str3 = "2024年6月26日 22:05:50";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date2 = sdf3.parse(str3);
        System.out.println(date2.getTime());
    }
}
