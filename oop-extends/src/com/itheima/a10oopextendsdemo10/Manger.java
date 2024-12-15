package com.itheima.a10oopextendsdemo10;

public class Manger extends Employee{
    private double bonus;

    public Manger() {
    }

    public Manger(String id, String name, double wages, double bonus) {
        super(id, name, wages);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void Work() {
        System.out.println("管理其他人");
    }
}
