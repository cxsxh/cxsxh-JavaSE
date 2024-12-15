package com.itheima.a02test;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Hang-code\\Demo");
        file.mkdir();
        File file1 = new File(file, "a.txt");
        boolean newFile = file1.createNewFile();
        if (!newFile) {
            System.out.println("创建成功");
        } else {
            System.out.println("创建失败");
        }
    }
}
