package com.itheima.a02myhashmap;

import java.util.*;

public class A06_HashMapDemo2 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};

        ArrayList<String> al = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int number = r.nextInt(arr.length);
            al.add(arr[number]);
        }

        HashMap<String, Integer> hs = new HashMap<>();
        for (String name : al) {
            if (hs.containsKey(name)) {
                int count = hs.get(name);
                count++;
                hs.put(name, count);
            } else {
                hs.put(name, 1);
            }
        }
        System.out.println(hs);

        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hs.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int sum = entry.getValue();
            if (max < sum){
                max = sum;
            }
        }
        System.out.println(max);

        for (Map.Entry<String, Integer> entry : entries) {
            int sum = entry.getValue();
            if (max == sum){
                System.out.println(entry.getKey());
            }
        }
    }
}
