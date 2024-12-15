package com.itheima.test;

public class Test1 {
    public static void main(String[] args) {
        getLength(20, 20);
    }

    public static void getLength(double len, double width) {
        double result = (len + width) * 2;
        System.out.println(result);
    }
}
