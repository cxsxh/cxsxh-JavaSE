package com.itheima.mygenerics;

import java.util.ArrayList;

public class GenericsDemo1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        Student.addList(al, "a", "b");
        System.out.println(al);
        
    }
}
