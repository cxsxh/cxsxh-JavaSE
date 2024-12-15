package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class StreamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "A1", "A1", "A2", "A3", "AA");

        long count = list.stream().count();
        System.out.println(count);

        String[] array = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });

        String[] array1 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(array1));
    }
}
