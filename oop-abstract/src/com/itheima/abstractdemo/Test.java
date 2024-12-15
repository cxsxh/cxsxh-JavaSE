package com.itheima.abstractdemo;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("青蛙", 1);
        System.out.println(f.getName() + "," + f.getAge() + "岁");
        f.Eat();
        f.Drink();

        Dog d = new Dog("狗", 2);
        System.out.println(d.getName() + "," + d.getAge() + "岁");
        d.Eat();
        d.Drink();

        Sheep s = new Sheep("羊", 3);
        System.out.println(s.getName() + "," + s.getAge() + "岁");
        s.Eat();
        s.Drink();
    }
}
