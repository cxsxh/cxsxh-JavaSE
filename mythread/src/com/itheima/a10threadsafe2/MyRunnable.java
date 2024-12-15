package com.itheima.a10threadsafe2;

public class MyRunnable implements Runnable {
    static int counter = 0;

    @Override
    public void run() {
        while (true) {
            if (method()) break;
        }
    }

    private synchronized boolean method() {
        if (counter == 100) {
            return true;
        } else {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter++;
            System.out.println(Thread.currentThread().getName() + ": " + counter);
        }
        return false;
    }
}
