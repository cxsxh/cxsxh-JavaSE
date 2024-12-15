package com.itheima.a05interfacedemo05;

public class PingPongInstructor extends Instructor implements English{
    public PingPongInstructor() {
    }

    public PingPongInstructor(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }

    @Override
    public void Teach() {
        System.out.println("教打乒乓球");
    }
}
