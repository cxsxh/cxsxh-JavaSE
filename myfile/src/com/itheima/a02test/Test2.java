package com.itheima.a02test;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        File file = new File("D:\\Hang-code");
        boolean b = haveTxt(file);
        System.out.println(b);
    }

    public static boolean haveTxt(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile() && file1.getName().endsWith(".txt")) {
                return true;
            }
        }
        return false;
    }
}
