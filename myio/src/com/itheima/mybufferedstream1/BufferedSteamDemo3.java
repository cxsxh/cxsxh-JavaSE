package com.itheima.mybufferedstream1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedSteamDemo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myio\\a.txt"));

//        br.lines().forEach(System.out::println);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

    }
}
