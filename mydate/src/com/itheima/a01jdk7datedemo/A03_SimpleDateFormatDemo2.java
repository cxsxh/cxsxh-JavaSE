package com.itheima.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A03_SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {

        //2000-11-11 转换 2000年11月11日


        String string = "2000-11-11";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(string);
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd日");
        String string1 = simpleDateFormat1.format(date);
        System.out.println(string1);
    }
}
