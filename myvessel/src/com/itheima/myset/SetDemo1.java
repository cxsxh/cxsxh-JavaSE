package com.itheima.myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("张三");
        System.out.println(s.add("张三"));
        s.add("李四");
        s.add("王五");

        System.out.println(s);

        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

        for (String string : s) {
            System.out.println(string);
        }

        s.forEach(s1 -> System.out.println(s1));
    }
}
