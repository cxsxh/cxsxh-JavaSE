package com.itheima.a06test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer>  al = new ArrayList<>();
        Collections.addAll(al, 1,1,1,1,1,1,1);
        Collections.addAll(al, 0,0,0);
//        Collections.shuffle(al);
        Random r = new Random();
        int index = r.nextInt(al.size());
        int number = al.get(index);
        System.out.println(number);

        ArrayList<String> boy = new ArrayList<>();
        ArrayList<String> girl = new ArrayList<>();
        Collections.addAll(boy, "N1", "N2", "N3");
        Collections.addAll(girl, "V1", "V2", "V3");
        if (number == 1) {
            int boyIndex = r.nextInt(boy.size());
            String name = boy.get(boyIndex);
            System.out.println(name);
        } else {
            int girlIndex = r.nextInt(girl.size());
            String n = girl.get(girlIndex);
            System.out.println(n);
        }
    }
}
