package com.itheima.skiploop;

public class SkipLoopDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("老虎在吃第" + i + "个包子");
        }
    }
}
