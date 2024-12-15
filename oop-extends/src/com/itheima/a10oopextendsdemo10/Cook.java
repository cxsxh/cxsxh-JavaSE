package com.itheima.a10oopextendsdemo10;

public class Cook extends Employee{
    public Cook() {
    }

    public Cook(String id, String name, double wages) {
        super(id, name, wages);
    }

    @Override
    public void Work() {
        System.out.println("做饭");
    }
}
