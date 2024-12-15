package com.itheima.a01myexception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
//            String s = e.getMessage();

//            String string = e.toString();

//            System.out.println(s);

            e.printStackTrace();
        }

        System.out.println("look");
        System.err.println("look");
    }
}
