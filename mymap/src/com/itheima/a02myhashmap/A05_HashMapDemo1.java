package com.itheima.a02myhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class A05_HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 21);
        Student s3 = new Student("wangwu", 22);
        Student s4 = new Student("wangwu", 22);

        hm.put(s1, "sd");
        hm.put(s2, "bj");
        hm.put(s3, "hn");
        hm.put(s4, "hz");
        System.out.println(hm);

        Set<Student> students = hm.keySet();
        for (Student student : students) {
            String value = hm.get(student);
            System.out.println(student + "=" + value);
        }

        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry);
        }

        entries.forEach(studentStringEntry -> System.out.println(studentStringEntry));

        hm.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student student, String s) {
                System.out.println(student + "=" + s);
            }
        });
    }
}
