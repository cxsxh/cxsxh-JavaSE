package com.itheima.a11oopextendsdemo11;

public class Test {
    public static void main(String[] args) {
        Lecturer l = new Lecturer("heima001", "阿玮");
        System.out.println(l.getId() + "," + l.getName());
        l.Work();

        System.out.println("----------------------------------");

        Tutor t = new Tutor("heima002", "小帅");
        System.out.println(t.getId() + "," + t.getName());
        t.Work();

        System.out.println("----------------------------------");

        Maintenance m = new Maintenance();
        m.setId("heima003");
        m.setName("张三");
        System.out.println(m.getId() + "," + m.getName());
        m.Work();

        System.out.println("----------------------------------");

        Purchase p = new Purchase();
        p.setId("heima004");
        p.setName("李四");
        System.out.println(p.getId() + "," + p.getName());
        p.Work();

        System.out.println("----------------------------------");

        cxsxh c = new cxsxh();
        c.setId("cxsxh001");
        c.setName("cxsxh");
        c.setWages(15000);

        System.out.println(c.getId() + "," + c.getName() + "," + c.getWages());
        c.Work();
    }
}
