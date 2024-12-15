package com.itheima.a02test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        File file = new File("D:\\Hang-code\\Demo");

        HashMap<String, Integer> map = getCount(file);
        System.out.println(map);
    }

    public static HashMap<String, Integer> getCount(File Demo) {
        HashMap<String, Integer> map = new HashMap<>();
        File[] files = Demo.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                String name = file.getName();
                String[] s = name.split("\\.");
                if (s.length >= 2) {
                    String endName = s[s.length - 1];
                    if (map.containsKey(endName)) {
                        int count = map.get(endName);
                        count++;
                        map.put(endName, count);
                    } else {
                        map.put(endName, 1);
                    }
                }
            } else {
                HashMap<String, Integer> sonMap = getCount(file);
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    int value = entry.getValue();
                    if (map.containsKey(key)) {
                        int count = map.get(key);
                        count = count + value;
                        map.put(key, count);
                    } else {
                        map.put(key, value);
                    }
                }
            }
        }
        return map;
    }
}
