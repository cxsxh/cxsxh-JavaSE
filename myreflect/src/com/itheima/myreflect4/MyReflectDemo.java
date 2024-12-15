package com.itheima.myreflect4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> aClass = Class.forName("com.itheima.myreflect4.Student");

        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }

        Method sleep = aClass.getDeclaredMethod("sleep", String.class);

        sleep.setAccessible(true);

        int i = sleep.getModifiers();
        System.out.println(i);

        String name = sleep.getName();
        System.out.println(name);

        Parameter[] parameters = sleep.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        Class<?>[] exceptionTypes = sleep.getExceptionTypes();
        for (Class<?> exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }

        Student student = new Student();
        String sj = (String) sleep.invoke(student, "睡觉");
        System.out.println(sj);
    }
}
