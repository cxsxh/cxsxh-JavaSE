package com.itheima.mybufferedstream1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedSteamDemo4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\e.txt"));

        bw.write("你好你好你好你好你好");
        bw.newLine();
        bw.close();
    }
}
