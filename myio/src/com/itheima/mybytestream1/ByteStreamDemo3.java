package com.itheima.mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("myio\\a.txt", true);
        String str = "HangHang";
        byte[] bytes = str.getBytes();
        fos.write(bytes);

        String str2 = "\r\n";
        byte[] bytes1 = str2.getBytes();
        fos.write(bytes1);

        String str3 = "666";
        byte[] bytes2 = str3.getBytes();
        fos.write(bytes2);

        fos.close();
    }
}
