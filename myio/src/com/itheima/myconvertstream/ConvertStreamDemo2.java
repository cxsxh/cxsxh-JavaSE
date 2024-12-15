package com.itheima.myconvertstream;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("myio\\b.txt", Charset.forName("UTF-8"));
        fw.write("你好");
        fw.close();
    }
}
