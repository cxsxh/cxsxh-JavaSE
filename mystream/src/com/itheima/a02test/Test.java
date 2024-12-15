package com.itheima.a02test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,5,6,7,8,9,10);
        List<Integer> collect = list.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        collect.forEach(s -> System.out.println(s));
    }
}
