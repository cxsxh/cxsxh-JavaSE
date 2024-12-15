package com.itheima.a06test;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> city1 = new ArrayList<>();
        ArrayList<String> city2 = new ArrayList<>();
        ArrayList<String> city3 = new ArrayList<>();
        Collections.addAll(city1, "lh", "xc", "zk");
        Collections.addAll(city2, "wz", "hz", "hn");
        Collections.addAll(city3, "sjz", "bd", "zjk");

        hm.put("河南", city1);
        hm.put("浙江", city2);
        hm.put("河北", city3);

        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(", ", "", "。");
            for (String city : value) {
                sj.add(city);
            }
            System.out.println(key + " = " + sj);
        }
    }
}
