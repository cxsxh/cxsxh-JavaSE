package com.itheima.a04innerclassdemo4;

public class Test {
    public static void main(String[] args) {
        Outer.show os = new Outer.show();
        os.show1();

        Outer.show.show2();
    }
}
