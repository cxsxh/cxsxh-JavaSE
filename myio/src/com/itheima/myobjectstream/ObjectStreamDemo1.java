package com.itheima.myobjectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {
        Student stu = new Student("name", 22);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myio\\a.txt"));

        oos.writeObject(stu);
        oos.close();
    }
}
