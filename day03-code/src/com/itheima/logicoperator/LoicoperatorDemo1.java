package com.itheima.logicoperator;

public class LoicoperatorDemo1 {
    public static void main(String[] args) {
        //并且
        //两边都为真 结果才是真
        System.out.println(true & true);
        System.out.println(false & false);
        System.out.println(true & false);
        System.out.println(1 & 1);

        //两边都是假，结果才是假
        System.out.println(true | true);
        System.out.println(false | false);
        System.out.println(true | false);
        System.out.println(1 | 1);
    }
}
