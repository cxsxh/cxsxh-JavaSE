package com.itheima.test;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myio\\e.txt"));

        TreeMap<Integer, String> tm = new TreeMap<>();
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] str = line.split("\\.");
            tm.put(Integer.parseInt(str[0]), line);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\d.txt"));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String str = entry.getValue();
            bw.write(str);
            bw.newLine();
        }
        bw.close();
    }
}
