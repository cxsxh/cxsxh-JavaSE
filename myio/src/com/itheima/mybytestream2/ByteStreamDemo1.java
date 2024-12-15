package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myio\\a.txt");
        int i = fis.read();
        System.out.println((char)i);

        int i1 = fis.read();
        System.out.println((char)i1);

        int i2 = fis.read();
        System.out.println((char)i2);

        int i3 = fis.read();
        System.out.println((char)i3);

        fis.close();
    }
}
