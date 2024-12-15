package com.itheima.search;

import java.util.ArrayList;
import java.util.List;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79, 7};
        int number = 7;
        System.out.println(BasicSearch(arr, number));
    }

    public static List<Integer> BasicSearch(int[] arr, int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                list.add(i);
            }
        }
        return list;
    }
}
