package com.itheima.test;

import java.io.*;

public class Test6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myio\\b.txt"));
        String s = br.readLine();
        br.close();

        int count = Integer.parseInt(s);
        count++;

        if (count <= 3) {
            System.out.println("第" + count + "次使用");
        } else {
            System.out.println("次数用尽");
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\b.txt"));
        bw.write(count + "");
        bw.close();
    }
}
