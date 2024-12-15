package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "张三", "张三丰", "张太难", "李四", "张心");
        list.stream().filter(n -> n.startsWith("张")).filter(name -> name.length() == 3).forEach(n -> System.out.println(n));
    }
}
