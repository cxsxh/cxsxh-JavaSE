package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class A04_MapDemo4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A1", "A2");
        map.put("B1", "B2");
        map.put("C1", "C2");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String Key, String Value) {
                System.out.println(Key + "=" + Value);
            }
        });
    }
}
