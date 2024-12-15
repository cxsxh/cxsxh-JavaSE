package com.itheima.a05interfacedemo05;

public class Test {
    public static void main(String[] args) {
        PingPongInstructor ppi = new PingPongInstructor("张三", 23);
        System.out.println(ppi.getName() + "," + ppi.getAge());
        ppi.speakEnglish();
        ppi.Teach();

        PingPongJock ppj = new PingPongJock("李四", 22);
        System.out.println(ppj.getName() + "," + ppj.getAge());
        ppj.Learn();
        ppj.speakEnglish();

        BasketballInstructor bi = new BasketballInstructor("王五", 21);
        System.out.println(bi.getName() + "," + bi.getAge());
        bi.Teach();

        BasketballJock bj = new BasketballJock("赵六", 20);
        System.out.println(bj.getName() + "," + bj.getAge());
        bj.Learn();
    }
}
