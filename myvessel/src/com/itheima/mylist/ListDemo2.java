package com.itheima.mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        for (String string : list) {
            System.out.print(string + " ");
        }

        System.out.println();

        list.forEach(s -> System.out.print(s + " "));

        System.out.println();

        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            String s = i.next();
            System.out.print(s + " ");
        }

        System.out.println();

        ListIterator<String> LS = list.listIterator();
        while (LS.hasNext()) {
            String s = LS.next();
            if ("bbb".equals(s)) {
                LS.add("ppp");
            }
        }
        System.out.println(list);
    }
}
