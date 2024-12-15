package com.itheima.a04polymorphismdemo4;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("张三", 20);
        Dog d = new Dog("黄色", 2);
        p.keepPet(d, "狗粮");

        Person p1 = new Person("李四", 22);
        Cat c = new Cat("白色", 2);
        p1.keepPet(c, "芝士汉堡");
    }
}
