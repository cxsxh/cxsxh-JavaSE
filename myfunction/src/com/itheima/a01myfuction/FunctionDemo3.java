package com.itheima.a01myfuction;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张辛心", "张长帐", "张来");
        list.stream().filter(new FunctionDemo3()::Operation).forEach(s -> System.out.println(s));
    }

    public boolean Operation(String s) {
        return s.startsWith("张") && s.length() == 3;
    }
}
