package com.itheima.a11oopextendsdemo11;

public class Purchase extends Employee{
    public Purchase() {
    }

    public Purchase(String id, String name) {
        super(id, name);
    }

    @Override
    public void Work() {
        System.out.println("采购");
    }
}
