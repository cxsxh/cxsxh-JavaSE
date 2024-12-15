package com.itheima.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);
        register(s);

        System.out.println("------------------------");

        Teacher t = new Teacher();
        t.setName("李四");
        t.setAge(19);
        register(t);

        System.out.println("------------------------");

        Admin a = new Admin();
        a.setName("王五");
        a.setAge(20);
        register(a);
    }

    public static void register(Person p) {
        p.show();
    }
}
