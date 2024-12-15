package com.itheima.mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("myio\\a.txt");
        byte[] buf = {97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
        fos.write(buf, 1, 3);
        fos.close();

    }
}
