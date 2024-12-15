package com.ithheima.listdemo;

import java.util.ArrayList;

public class ArrListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

//        list.remove("aaa");
        list.remove(1);

        String str = list.set(0, "a");

        System.out.println(str);

        System.out.println(list);

        String s = list.get(0);
        System.out.println(s);

        for (int i = 0; i < list.size(); i++) {
            String st = list.get(i);
            System.out.println(st);
        }
    }
}
