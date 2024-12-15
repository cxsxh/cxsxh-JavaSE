package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        coll.add("aaa");
        coll.add("aaa");
        coll.add("bbb");
        System.out.println(coll);

        coll.remove("aaa");
        System.out.println(coll);

        System.out.println(coll.contains("aaa"));

        System.out.println(coll.isEmpty());

        System.out.println(coll.size());

        coll.clear();
        System.out.println(coll);
    }
}
