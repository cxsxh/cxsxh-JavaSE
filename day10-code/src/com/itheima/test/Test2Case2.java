package com.itheima.test;

public class Test2Case2 {
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
        char[] arr = str.toCharArray();
        char first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;

        String result = new String(arr);
        return result;
    }
}
