package com.itheima.myreflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> aClass = Class.forName("com.itheima.myreflect2.Student");

        Constructor<?>[] constructors = aClass.getDeclaredConstructors();

        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        Constructor<?> constructor = aClass.getDeclaredConstructor(String.class, int.class);
        System.out.println(constructor);

        int i = constructor.getModifiers();
        System.out.println(i);

        Parameter[] parameters = constructor.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        constructor.setAccessible(true);
        Student o = (Student) constructor.newInstance("张三", 18);
        System.out.println(o);
    }
}
