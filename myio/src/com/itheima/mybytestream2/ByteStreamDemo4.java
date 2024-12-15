package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myio\\a.txt");

        byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        String str = new String(bytes, 0, len);
        System.out.println(str);

        int len1 = fis.read(bytes);
        String str1 = new String(bytes, 0, len1);
        System.out.println(str1);

        fis.close();
    }
}
