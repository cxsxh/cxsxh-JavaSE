package com.itheima.a11oopextendsdemo11;

public class cxsxh extends Employee{
    private double wages;

    public cxsxh() {
    }

    public cxsxh(String id, String name, double wages) {
        super(id, name);
        this.wages = wages;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    @Override
    public void Work() {
        System.out.println("Java工程师");
    }
}
