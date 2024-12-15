package com.itheima.a11oopextendsdemo11;

public class Maintenance extends Employee{
    public Maintenance() {
    }

    public Maintenance(String id, String name) {
        super(id, name);
    }

    @Override
    public void Work() {
        System.out.println("维护");
    }
}
