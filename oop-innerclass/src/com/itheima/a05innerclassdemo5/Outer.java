package com.itheima.a05innerclassdemo5;

public class Outer {
    int a = 10;

    public void show() {
        int b = 20;

        class show1{
            final int c = 30;

            public void show2() {
                System.out.println(a);
                System.out.println(b);
            }



        }

        show1 s = new show1();
        s.show2();
        System.out.println(s.c);

    }

}
