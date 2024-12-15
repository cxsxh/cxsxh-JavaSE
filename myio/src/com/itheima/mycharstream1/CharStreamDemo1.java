package com.itheima.mycharstream1;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("myio\\a.txt");

        int c;
        while ((c = fr.read()) != -1) {
            System.out.print((char) c);
        }

        fr.close();
    }
}
