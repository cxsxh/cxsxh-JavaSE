package com.itheima.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A03_SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:10:0";
        String orderStr = "2023年11月11日 0:01:0";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date1 = simpleDateFormat.parse(startStr);
        Date date2 = simpleDateFormat.parse(endStr);
        Date date3 = simpleDateFormat.parse(orderStr);

        long l1 = date1.getTime();
        long l2 = date2.getTime();
        long l3 = date3.getTime();

        if (l3 <= l2 && l3 >= l1) {
            System.out.println("参加活动成功");
        }
    }
}
