package com.itheima.a01innerclassdemo1;

public class Car {
    String name;
    int age;
    String color;

    public void show() {
        Engine e = new Engine();
        e.show();
    }

    class Engine {
        String engineName;
        int engineAge;

        public void show() {
            System.out.println(name);
            System.out.println(engineAge);
        }
    }
}
