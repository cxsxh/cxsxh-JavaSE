package com.itheima.a09threadsafe1;

public class MyThread extends Thread{
    static int counter = 0;

    @Override
    public void run() {
        while(true){
            synchronized(MyThread.class){
                if (counter < 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    counter++;
                    System.out.println(getName() + "正在卖第" + counter + "张");
                } else {
                    break;
                }
            }
        }
    }
}
