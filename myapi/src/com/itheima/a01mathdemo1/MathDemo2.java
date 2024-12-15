package com.itheima.a01mathdemo1;

public class MathDemo2 {
    public static void main(String[] args) {
        System.out.println(isPrime(997));
    }

    public static boolean isPrime(int number){
        int count = 0;
        for (int i = 2; i < Math.sqrt(number); i++) {
            count++;
            if (number % i == 0) {
                return false;
            }
        }
        System.out.println(count);
        return true;
    }
}
