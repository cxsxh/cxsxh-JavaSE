package com.itheima.a06test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list, "张三", "李四", "王五", "赵六", "前七");
        Random r = new Random();
        int size = list.size();
        for (int i = 0; i <= 10; i++) {
            System.out.println("==========第" + i + "次点名==========");
            for (int j = 0; j < size; j++) {
                int index = r.nextInt(list.size());
                String remove = list.remove(index);
                list1.add(remove);
                System.out.println(remove);
            }
            list.addAll(list1);
            list1.clear();
        }

    }
}
