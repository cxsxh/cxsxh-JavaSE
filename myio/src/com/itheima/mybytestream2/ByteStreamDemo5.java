package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("myio\\a.txt");
        FileOutputStream fos = new FileOutputStream("myio\\c.txt");

        int len;
        byte[] buf = new byte[1024 * 1024 * 5];
        while ((len = fis.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }

        fos.close();
        fis.close();

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
