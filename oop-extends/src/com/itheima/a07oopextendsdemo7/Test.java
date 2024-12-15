package com.itheima.a07oopextendsdemo7;

public class Test {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.Home();
        h.Eat();
        h.Drink();
        h.breakHome();

        System.out.println("------------------------------------");

        Sharpei s = new Sharpei();
        s.Eat();
        s.Drink();
        s.Home();

        System.out.println("------------------------------------");

        Chineseruraldog c = new Chineseruraldog();
        c.Eat();
        c.Drink();
        c.Home();
    }
}
