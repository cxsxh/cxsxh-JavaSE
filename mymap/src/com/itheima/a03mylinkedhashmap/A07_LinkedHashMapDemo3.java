package com.itheima.a03mylinkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class A07_LinkedHashMapDemo3 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
        lh.put("zhangsan", 16);
        lh.put("lisi", 17);
        lh.put("wangwu", 18);
        lh.put("qianqi", 16);
        lh.put("qianqi", 16);

        Set<Map.Entry<String, Integer>> entries = lh.entrySet();
        entries.forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry));

        Set<String> strings = lh.keySet();
        strings.forEach(s -> System.out.println(s + "=" + lh.get(s)));
        strings.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + "=" + lh.get(s));
            }
        });
        System.out.println("-----------------------------------");
        lh.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer i) {
                System.out.println(s + "=" + i);
            }
        });
        System.out.println("-----------------------------------");
        lh.forEach((String s, Integer i) -> System.out.println(s + "=" + i));
        System.out.println("-----------------------------------");
        lh.forEach((s, i) -> System.out.println(s + "=" + i));
    }
}
