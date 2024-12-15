package com.itheima.a01interfacedemo01;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("青蛙", 1);
        System.out.println(f.getName() + "," + f.getAge() + "岁");
        f.Eat();
        f.swim();

        Dog d = new Dog("狗", 3);
        System.out.println(d.getName() + "," + d.getAge() + "岁");
        d.Eat();
        d.swim();

        Rabbit r = new Rabbit("兔子", 3);
        System.out.println(r.getName() + "," + r.getAge() + "岁");
        r.Eat();
    }
}
