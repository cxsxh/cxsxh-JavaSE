package com.itheima.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("---");

        sj.add("aaa").add("ddd").add("ccc");

        System.out.println(sj);
    }
}
