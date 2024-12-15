package com.itheima.a01immutable;

import java.util.Map;

public class ImmutableDemo3 {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("1", "1", "2", "2", "3", "3");
        System.out.println(map);
    }
}
