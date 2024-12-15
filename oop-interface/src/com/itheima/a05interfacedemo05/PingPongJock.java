package com.itheima.a05interfacedemo05;

public class PingPongJock extends Athlete implements English{
    public PingPongJock() {
    }

    public PingPongJock(String name, int age) {
        super(name, age);
    }

    @Override
    public void Learn() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }
}
