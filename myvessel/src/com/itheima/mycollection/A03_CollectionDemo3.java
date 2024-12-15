package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A03_CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> cll = new ArrayList<>();
        cll.add("zs");
        cll.add("lisi");
        cll.add("ww");

        for (String string : cll) {
            System.out.println(string);
        }
    }
}
