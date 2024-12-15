package com.itheima.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myio\\537.jpg");
        FileOutputStream fos = new FileOutputStream("myio\\ency.jpg");

        int b;
        while((b = fis.read()) != -1) {
            fos.write(b ^ 2);
        }

        fos.close();
        fis.close();
    }
}
