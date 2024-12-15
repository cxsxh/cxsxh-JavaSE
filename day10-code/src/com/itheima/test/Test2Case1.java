package com.itheima.test;

public class Test2Case1 {
    public static void main(String[] args) {
        String strA = "bcdea";
        String strB = "abcde";

        boolean result = check(strA, strB);
        System.out.println(result);
    }

    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)) {
                return true;
            }
        }

        return false;
    }

    public static String rotate(String str) {
        char first = str.charAt(0);
        String end = str.substring(1);

        return end + first;
    }
}
