package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A04_CollectionDemo4 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("zs");
        coll.add("ls");
        coll.add("ww");

        coll.forEach(s -> System.out.println(s));
    }
}
