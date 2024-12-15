package com.itheima.mybufferedstream1;

import java.io.*;

public class BufferedSteamDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myio\\d.txt"));
        BufferedOutputStream bus = new BufferedOutputStream(new FileOutputStream("myio\\e.txt"));

        byte[] buf = new byte[1024];
        int len;
        while ((len = bis.read(buf)) != -1) {
            bus.write(buf, 0, len);
        }

        bus.close();
        bis.close();
    }
}
