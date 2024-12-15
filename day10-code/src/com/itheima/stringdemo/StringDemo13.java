package com.itheima.stringdemo;

public class StringDemo13 {
    public static void main(String[] args) {
        String talk = "你玩的真nm好,跟tm你m玩的一样";

        String[] arr = {"nm", "tm", "m", "cnm", "nmlgb"};

        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }

        System.out.println(talk);
    }
}
