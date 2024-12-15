package com.itheima.test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Sanhua> arrayList1 = new ArrayList<>();
        ArrayList<Lihua> arrayList2 = new ArrayList<>();
        ArrayList<Teddy> arrayList3 = new ArrayList<>();
        ArrayList<HuskDog> arrayList4 = new ArrayList<>();

        show(arrayList1);
        show(arrayList2);
        show(arrayList3);
        show(arrayList4);
    }

    public static void show(ArrayList<? extends Animal> arrayList){
        System.out.println(arrayList);
    }
}
