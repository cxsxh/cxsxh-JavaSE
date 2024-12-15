package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("A1", "A2");
        m.put("B1", "B2");
        m.put("C1", "C2");

//        m.remove("C1");

//        m.clear();

//        System.out.println(m.containsKey("A1"));
//        System.out.println(m.containsValue("A2"));

//        System.out.println(m.isEmpty());

        System.out.println(m.size());
        System.out.println(m);
    }
}
