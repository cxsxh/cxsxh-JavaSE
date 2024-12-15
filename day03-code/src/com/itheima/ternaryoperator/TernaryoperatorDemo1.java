package com.itheima.ternaryoperator;

public class TernaryoperatorDemo1 {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 30;
        int max = number1 > number2 ? number1 : number2;
        System.out.println(max);

        System.out.println(number1 > number2 ? number1 : number2);
    }
}
