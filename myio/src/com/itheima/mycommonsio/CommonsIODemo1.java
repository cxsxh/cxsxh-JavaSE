package com.itheima.mycommonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonsIODemo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("myio\\a.txt");
        File file1 = new File("myio\\b.txt");
        FileUtils.copyFile(file, file1);

        FileUtils.copyDirectoryToDirectory(file, file1);

        FileUtils.deleteDirectory(file);
        FileUtils.cleanDirectory(file1);
    }
}
