package com.itheima.a14waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> abq = new ArrayBlockingQueue<>(1);

        Cook cook = new Cook(abq);
        Foodie foodie = new Foodie(abq);

        cook.start();
        foodie.start();
    }
}
