package com.itheima.a01immutable;

import java.util.HashMap;
import java.util.Map;

public class ImmutableDemo4 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("a1", "a2");
        hashMap.put("b1", "b2");
        hashMap.put("c1", "c2");

        Map<Object, Object> objectObjectMap = Map.ofEntries(hashMap.entrySet().toArray(new Map.Entry[0]));
        Map<String, String> map = Map.copyOf(hashMap);
        System.out.println(map);
        System.out.println(objectObjectMap);
    }
}
