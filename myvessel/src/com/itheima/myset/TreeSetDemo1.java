package com.itheima.myset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(1);
        ts.add(4);
        ts.add(3);
        ts.add(2);

        System.out.println(ts);

        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }

        System.out.println("--------------------------");

        for (Integer t : ts) {
            System.out.println(t);
        }

        System.out.println("--------------------------");

        ts.forEach(integer -> System.out.println(integer));
    }
}
