package com.itheima.a01myfile;

import java.io.File;
import java.lang.String;

public class FileDemo1 {
    public static void main(String[] args) {
        File file1 = new File("D:\\Hang-code\\Demo.txt");
        boolean directory = file1.isDirectory();
        boolean file = file1.isFile();
        boolean exists = file1.exists();
        System.out.println(directory);
        System.out.println(file);
        System.out.println(exists);

        System.out.println("------------------------------");

        long length = file1.length();
        System.out.println(length);

        System.out.println("------------------------------");

        String s = file1.getAbsolutePath();
        File s3 = file1.getAbsoluteFile();
        File file2 = file1.getAbsoluteFile();
        System.out.println(file2);

        System.out.println("------------------------------");

        String s1 = file1.getPath();
        System.out.println(s1);

        System.out.println("------------------------------");

        String name = file1.getName();
        System.out.println(name);

        System.out.println("------------------------------");

        long l = file1.lastModified();
        System.out.println(l);
    }
}
