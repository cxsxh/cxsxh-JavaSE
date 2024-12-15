package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myio\\a.txt");
        FileOutputStream fos = new FileOutputStream("myio\\b.txt");

        int f;
        while ((f = fis.read()) != -1) {
            fos.write(f);
        }

        fos.close();
        fis.close();
    }
}
