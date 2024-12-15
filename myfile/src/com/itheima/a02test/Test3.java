package com.itheima.a02test;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        File file = new File("D:\\Hang-code");
        findTxt(file);
    }

    public static void findTxt(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    String name = f.getName();
                    if (name.endsWith(".txt")) {
                        System.out.println(f);
                    }
                } else {
                    findTxt(f);
                }
            }
        }

    }
}
