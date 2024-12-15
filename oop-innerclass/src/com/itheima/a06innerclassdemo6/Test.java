package com.itheima.a06innerclassdemo6;

public class Test {
    public static void main(String[] args) {
        Swim s = new Swim() {
            @Override
            public void show() {
                System.out.println("游泳");
            }
        };
        s.show();
    }
}
