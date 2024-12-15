package com.itheima.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("myio\\a.txt");
        StringBuilder sb = new StringBuilder();

        int len;
        while ((len = fr.read()) != -1) {
            sb.append((char) len);
        }

        Integer[] arr = Arrays.stream(sb.toString().split("-")).map(Integer::parseInt).sorted().toArray(Integer[]::new);
        FileWriter fw = new FileWriter("myio\\a.txt");
        String s = Arrays.toString(arr).replace(", ", "-");
        String result = s.substring(1, s.length() - 1);
        fw.write(result);

        fw.close();
        fr.close();
    }
}
