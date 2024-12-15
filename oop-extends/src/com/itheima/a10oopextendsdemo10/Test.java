package com.itheima.a10oopextendsdemo10;

public class Test {
    public static void main(String[] args) {
        Manger m = new Manger("heima001", "张三", 15000, 8000);

        System.out.println(m.getId() + "," + m.getName() + "," + m.getWages() + "," + m.getBonus());
        m.Work();
        m.Eat();

        Cook c = new Cook();
        c.setId("heima002");
        c.setName("李四");
        c.setWages(8000);

        System.out.println(c.getId() + "," + c.getName() + "," + c.getWages());
        c.Work();
        c.Eat();
    }
}
