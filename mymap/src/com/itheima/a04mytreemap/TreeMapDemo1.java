package com.itheima.a04mytreemap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        tm.put(1, "康帅傅");
        tm.put(2, "渴口可乐");
        tm.put(3, "雷碧");

        tm.forEach((i, s) -> System.out.println(i + "-" + s));
    }
}
