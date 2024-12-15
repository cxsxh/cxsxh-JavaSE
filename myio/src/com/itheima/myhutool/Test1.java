package com.itheima.myhutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        File file = FileUtil.file("myio", "x", "y", "a.txt");

        File touch = FileUtil.touch(file);
        System.out.println(touch);

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        File file1 = FileUtil.writeLines(list, "myio\\a.txt", "UTF-8");
        System.out.println(file1);

        List<String> list1 = FileUtil.readLines("myio\\a.txt", "UTF-8");
        System.out.println(list1);


    }
}
