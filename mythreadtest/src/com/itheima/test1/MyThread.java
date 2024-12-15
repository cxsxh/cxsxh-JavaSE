package com.itheima.test1;

import java.util.Random;

public class MyThread extends Thread {
    static double money = 100;
    static int count = 3;
    static double min = 0.01;

    @Override
    public void run() {
        synchronized (MyThread.class) {
            if (money == 0) {
                System.out.println(getName() + "没抢到红包");
            } else {
                double prize = 0;
                if (count == 1) {
                    prize = money;
                } else {
                    Random r = new Random();
                    double bounds = money - (money - 1) * min;
                    prize = r.nextDouble(bounds);
                    if (prize < min) {
                        prize = min;
                    }
                }
                money = money - prize;
                count--;
                System.out.println(getName() + "抢到了" + prize + "元");
            }
        }
    }

}
