package com.itheima.mybufferedstream1;

import java.io.*;

public class BufferedSteamDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myio\\a.txt"));
        BufferedOutputStream bus = new BufferedOutputStream(new FileOutputStream("myio\\d.txt"));

        int len;
        while ((len = bis.read()) != -1) {
            bus.write(len);
        }

        bus.close();
        bis.close();
    }
}
