package com.itheima.mydynamicproxy1;

public class Test {
    public static void main(String[] args) {
        BigStar star = new BigStar("鸡哥");
        Star proxy = ProxyUtil.createProxy(star);

        String s = proxy.sing("只因你太美");
        System.out.println(s);
    }
}
