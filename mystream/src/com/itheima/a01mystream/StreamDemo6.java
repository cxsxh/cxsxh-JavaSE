package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "A1", "A21", "AAA");

        list.stream().filter(n -> n.startsWith("A")).filter(n -> n.length() == 3).forEach(n -> System.out.println(n));


    }
}
