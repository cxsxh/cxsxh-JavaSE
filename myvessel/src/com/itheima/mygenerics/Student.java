package com.itheima.mygenerics;

import java.util.ArrayList;

public class Student {
    public static<E> void addList(ArrayList<E> al, E e1, E e2) {
        al.add(e1);
        al.add(e2);
    }
}
