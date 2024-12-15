package com.itheima.a04mytreemap;

import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<>();

        Student s1 = new Student("zhangsan", 21);
        Student s2 = new Student("lisi", 22);
        Student s3 = new Student("qianqi", 20);
        tm.put(s1, "hn");
        tm.put(s2, "xc");
        tm.put(s3, "zk");

        tm.forEach((s, st) -> System.out.println(s + "=" + st));
    }
}
