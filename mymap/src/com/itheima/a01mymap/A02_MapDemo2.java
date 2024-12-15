package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("A1", "A2");
        m.put("B1", "B2");
        m.put("C1", "C2");

        Set<String> s = m.keySet();
        for (String Key : s) {
            System.out.println(Key);

            String Value = m.get(Key);
            System.out.println(Key + " = " + Value);
        }

        System.out.println("----------------------------------");

        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            String Key = it.next();
            System.out.println(Key);

            String Value = m.get(Key);
            System.out.println(Key + " = " + Value);
        }

        System.out.println("----------------------------------");

        s.forEach(s1 -> System.out.println(s1 + " = " + m.get(s1)));
    }
}
