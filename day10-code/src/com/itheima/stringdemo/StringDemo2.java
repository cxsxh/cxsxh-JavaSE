package com.itheima.stringdemo;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";

        System.out.println(s1 == s2);

        boolean result = s1.equals(s2);
        System.out.println(result);

        boolean result2 = s2.equalsIgnoreCase(s1);
        System.out.println(result2);
    }
}
