package com.itheima.myreflect1;

public class MyReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.itheima.myreflect1.Student");
        System.out.println(aClass);

        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);

        Student student = new Student();
        Class<? extends Student> aClass1 = student.getClass();
        System.out.println(student.getClass());
    }
}
