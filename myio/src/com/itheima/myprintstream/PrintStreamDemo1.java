package com.itheima.myprintstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("myio\\e.txt"), true, Charset.forName("UTF-8"));

        ps.println(97);
        ps.close();
    }
}
