package com.itheima.a08interfacedemo08;

public interface Inter {
    public default void show() {
        System.out.println("程序正在执行");
        show3();
    }

    public static void show2() {
        System.out.println("程序正在运行");
        show4();
    }

    private void show3() {
        System.out.println("程序的日志");
    }

    private static void show4() {
        System.out.println("s");
    }
}
