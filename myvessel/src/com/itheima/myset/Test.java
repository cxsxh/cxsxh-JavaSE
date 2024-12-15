package com.itheima.myset;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        StudentTwo s1 = new StudentTwo("zhangsan", 22, 80, 88, 80);
        StudentTwo s2 = new StudentTwo("lis", 22, 79, 80, 91);
        StudentTwo s3 = new StudentTwo("wangwu", 21, 80, 80, 85);
        StudentTwo s4 = new StudentTwo("zhaoliu", 21, 79, 83, 88);
        StudentTwo s5 = new StudentTwo("qianqi", 20, 80, 82, 86);

        TreeSet<StudentTwo> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (StudentTwo t : ts) {
            System.out.println(t);
        }
    }
}
