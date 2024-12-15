package com.itheima.mygenerics;

public class GenericsDemo2 {
    public static void main(String[] args) {
        MyArrayList<String> array = new MyArrayList<>();

        array.add("aaa");

        System.out.println(array.get(0));

        System.out.println(array);
    }
}
