package com.itheima.a02test;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        File file = new File("D:\\Hang-code\\Demo");
        long lon = getLon(file);
        System.out.println(lon);
    }

    private static long getLon(File file) {
        long lon = 0;
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                lon += file1.length();
            } else {
                lon += getLon(file1);
            }
        }
        return lon;
    }
}
