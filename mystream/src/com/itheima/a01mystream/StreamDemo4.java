package com.itheima.a01mystream;

import java.util.Arrays;

public class StreamDemo4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr).forEach(i -> System.out.println(i));
    }
}
