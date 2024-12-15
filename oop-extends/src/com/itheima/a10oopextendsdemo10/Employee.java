package com.itheima.a10oopextendsdemo10;

public class Employee {
    private String id;
    private String name;
    private double wages;

    public Employee() {
    }

    public Employee(String id, String name, double wages) {
        this.id = id;
        this.name = name;
        this.wages = wages;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public void Work() {
        System.out.println("员工在工作");
    }

    public void Eat() {
        System.out.println("吃饭");
    }
}
