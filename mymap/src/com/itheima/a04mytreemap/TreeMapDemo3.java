package com.itheima.a04mytreemap;

import java.util.StringJoiner;
import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        String s = "aababcabcdabcde";

        TreeMap<Character, Integer> tm = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (tm.containsKey(c)) {
                Integer count = tm.get(c);
                count++;
                tm.put(c, count);
            } else {
                tm.put(c, 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        tm.forEach((c, i) -> sb.append(c).append("(").append(i).append(")"));
        
        StringJoiner sj = new StringJoiner("", "", "");
        tm.forEach((c1, i1) -> sj.add(c1 + "").add("(").add(i1 + "").add(")"));

        System.out.println(sb);

        System.out.println("-----------------------------------");

        System.out.println(sj);
    }
}
