package com.itheima.a01mystream;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StreamDemo3 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("A1", 1);
        hashMap.put("A2", 2);
        hashMap.put("A3", 3);
        hashMap.put("A4", 4);
        hashMap.put("A5", 5);

        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        entries.stream().forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry));

    }
}
