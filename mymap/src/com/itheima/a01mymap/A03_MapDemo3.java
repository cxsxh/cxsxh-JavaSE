package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A03_MapDemo3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A1", "A2");
        map.put("B1", "B2");
        map.put("C1", "C2");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
            String Key = entry.getKey();
            String Value = entry.getValue();
            System.out.println(Key + "=" + Value);
        }

        System.out.println("--------------------------");

        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry);
            String Key = entry.getKey();
            String Value = entry.getValue();
            System.out.println(Key + "=" + Value);
        }

        System.out.println("--------------------------");

        entries.forEach(stringStringEntry -> System.out.println(stringStringEntry.getKey() + "=" + stringStringEntry.getValue()));

        System.out.println("--------------------------");

        entries.forEach(SSE -> System.out.println(SSE));

        System.out.println("--------------------------");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
            String Key = entry.getKey();
            String Value = entry.getValue();
            System.out.println(Key + "=" + Value);
        }
    }
}
