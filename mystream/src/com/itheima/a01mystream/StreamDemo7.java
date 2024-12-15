package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list, "A1", "A1", "A2", "A3", "AA");
        Collections.addAll(list1, "B1", "B2");

        list.stream().distinct().forEach(l -> System.out.println(l));
        Stream.concat(list.stream(), list1.stream()).forEach(s -> System.out.println(s));
    }
}
