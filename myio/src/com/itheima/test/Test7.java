package com.itheima.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student("zhansgan", 16);
        Student s2 = new Student("lisi", 17);
        Student s3 = new Student("wangwu", 18);

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myio\\e.txt"));

        oos.writeObject(list);
        oos.close();
    }
}
