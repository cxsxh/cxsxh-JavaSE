package com.itheima.a03polymorphismdemo3;

public class Test {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();

        d.eat();
        c.eat();

        if (d instanceof Dog dd) {
            dd.lookHome();
        } else if (d instanceof Cat cc) {
            cc.Scratch();
        } else {
            System.out.println("转换失败");
        }
    }
}

class Animal {
    public void eat() {
        System.out.println("吃东西");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookHome() {
        System.out.println("看家");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("小猫，你可以吃芝士汉堡");
    }

    public void Scratch() {
        System.out.println("抓老鼠");
    }
}
