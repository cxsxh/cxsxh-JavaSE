package com.itheima.a04test;

public class Test2 {
    public static void main(String[] args) {
        String string = "123456789";
        if (!string.matches("[1-9]\\d{0,9}")) {
            System.out.println("数据格式有误");
        } else {
            System.out.println("数据格式正确");
        }

        int number = 0;
        for (int i = 0; i < string.length(); i++) {
            int c = string.charAt(i) - '0';
            number = number * 10 + c;
        }

        System.out.println(number);
    }
}
