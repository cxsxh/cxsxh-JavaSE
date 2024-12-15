package com.itheima.a06innerclassdemo6;

public class Demo {
    public static void main(String[] args) {
        show(
                new SwimDemo() {
                    @Override
                    public void show() {
                        System.out.println("游泳的实现");
                    }
                }
        );
    }

    public static void show(SwimDemo s) {
        s.show();
    }
}
