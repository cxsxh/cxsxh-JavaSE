package com.itheima.stringbuilderdemo;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");

//        sb.append("efj");
//        sb.append(21);
//        sb.append(true);

        sb.reverse();

        int i = sb.length();

        System.out.println(i);

        System.out.println(sb);
    }
}
