package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zz-18", "cc-19", "jj-20");

        list.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s -> System.out.println(s));
    }
}
