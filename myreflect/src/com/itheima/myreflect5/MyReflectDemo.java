package com.itheima.myreflect5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class MyReflectDemo {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        Student student = new Student();
        Teacher teacher = new Teacher();

        saveObject(student);
    }

    private static void saveObject(Object object) throws IllegalAccessException, IOException {
        Class<?> aClass = object.getClass();

        BufferedWriter bf = new BufferedWriter(new FileWriter("myreflect\\z.txt"));

        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            Object value = field.get(object);

            bf.write(name + "=" + value);
            bf.newLine();
        }

        bf.close();
    }
}
