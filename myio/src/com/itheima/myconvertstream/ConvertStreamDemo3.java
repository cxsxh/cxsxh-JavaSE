package com.itheima.myconvertstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("myio\\a.txt", Charset.forName("UTF-8"));
        FileWriter fw = new FileWriter("myio\\b.txt", Charset.forName("UTF-8"));

        int c;
        while ((c = fr.read()) != -1) {
            fw.write(c);
        }

        fw.close();
        fr.close();
    }
}
