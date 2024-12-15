package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "AA-N-1", "AB-N-1", "AC-N-2", "AD-N-3", "AE-N-5");
        list.stream().filter(n -> "N".equals(n.split("-")[1])).forEach(n -> System.out.println(n));

        System.out.println("---------------------------------------");

        HashSet<String> set = new HashSet<>();
        Collections.addAll(set, "A1-N1-1", "A2-N2-1", "A3-N3-2", "A4-N4-3", "A5-N5-5");
        set.stream().filter(n -> "N".equals(n.split("-")[1])).forEach(n -> System.out.println(n));

        System.out.println("---------------------------------------");

        Map<String, Integer> collect = list.stream().filter(s -> "N".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {
                                             @Override
                                             public String apply(String s) {
                                                 return s.split("-")[0];
                                             }
                                         },
                        new Function<String, Integer>() {
                            @Override
                            public Integer apply(String s) {
                                return Integer.parseInt(s.split("-")[2]);
                            }
                        }));
        System.out.println(collect);
    }
}
