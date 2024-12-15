package com.itheima.mylist;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();

        l.add("zs");
        l.add("ls");
        l.add("ww");
        l.add("zl");

        for (String s : l) {
            System.out.println(s);
        }

        System.out.println(l);

        l.add(4, "dd");
        System.out.println(l.get(4));

        System.out.println(l.remove(4));

        System.out.println(l.set(3, "eh"));
    }
}
