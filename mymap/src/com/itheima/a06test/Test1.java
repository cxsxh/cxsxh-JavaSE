package com.itheima.a06test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        Collections.addAll(al, "张三", "李四", "王五", "老六", "前七", "夏克", "方雪", "放价");
        Random r = new Random();
        int index = r.nextInt(al.size());
        System.out.println(al.get(index));

        Collections.shuffle(al);
        System.out.println(al.getFirst());
    }
}
