package com.itheima.mycharset;

import java.io.UnsupportedEncodingException;

public class CharSetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "Hang-航";
        byte[] bytes = str.getBytes("GBK");
        str = new String(bytes, "GBK");
        System.out.println(
                str
        );
        String s = new String();
        s = "的";
        System.out.println(s);
    }
}
