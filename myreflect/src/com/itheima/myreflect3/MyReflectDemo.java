package com.itheima.myreflect3;

import java.lang.reflect.Field;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class<?> aClass = Class.forName("com.itheima.myreflect3.Student");

        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }

        Field name = aClass.getDeclaredField("name");
        System.out.println(name);

        name.setAccessible(true);

        int i = name.getModifiers();
        System.out.println(i);

        Class<?> type = name.getType();
        System.out.println(type);

        Student student = new Student("张三", 23);

        String s = (String) name.get(student);
        System.out.println(s);

        name.set(student, "李四");
        System.out.println(student);
    }
}
