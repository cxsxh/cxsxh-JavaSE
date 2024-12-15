package com.itheima.myconvertstream;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("myio\\a.txt", Charset.forName("UTF-8"));

        int c;
        while ((c = fr.read()) != -1) {
            System.out.print((char) c);
        }

        fr.close();
    }
}
