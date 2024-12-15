package com.itheima.a04test;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(toBinaryString(6));
    }

    public static String toBinaryString(int number){
        StringBuilder sb = new StringBuilder();

        while (true) {
            if (number == 0) {
                break;
            }

            int remaindar = number % 2;
            sb.insert(0, remaindar);
            number = number / 2;
        }
        return sb.toString();
    }
}
