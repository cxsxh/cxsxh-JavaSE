package com.itheima.stringdemo;

public class StringDemo10 {
    public static void main(String[] args) {
        String phoneNumber = "131098457886";

        String str1 = phoneNumber.substring(0, 4);
        String str2 = phoneNumber.substring(9);
        String result = "*****";
        String str3 = str1 + result + str2;
        System.out.println(str3);
    }
}
