package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        double area1 = getArea(5.2, 1.3);
        double area2 = getArea(1.2, 3.3);

        if (area1 > area2) {
            System.out.println("第一个长方形更大");
        } else {
            System.out.println("第二个长方形更大");
        }
    }
    public static double getArea(double len, double width) {
        double area = len * width;
        return area;

    }
}
