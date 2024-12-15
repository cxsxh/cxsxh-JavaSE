package com.itheima.a04innerclassdemo4;

public class Outer {
    private String name = "张三";
    private static int age;

    static class show{
        public void show1() {
            System.out.println("非静态方法");
            Outer o = new Outer();
            System.out.println(o.name);
        }

        public static void show2() {
            System.out.println("静态变量");
        }
    }
}
