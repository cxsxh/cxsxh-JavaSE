package com.itheima.test;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File Demo = new File("D:\\Hang-code\\Demo");
        File Demo1 = new File("D:\\Hang-code\\Demo1");

        copydir(Demo, Demo1);
    }

    private static void copydir(File demo, File demo1) throws IOException {
        demo1.mkdirs();

        File[] files = demo.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(demo1, file.getName()));

                byte[] buf = new byte[1024];
                int len;
                while ((len = fis.read(buf)) != -1) {
                    fos.write(buf, 0, len);
                }

                fos.close();
                fis.close();
            } else {
                copydir(file, new File(demo1, file.getName()));
            }
        }


    }
}
