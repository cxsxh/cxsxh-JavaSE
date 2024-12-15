package com.itheima.Switchdemo;

public class SwitchDemo3 {
    public static void main(String[] args) {
        int number = 1;
        switch (number){
            /*case穿透
            就是语句体中没有写break导致的
            执行流程：
            先拿小括号中表达式的值跟下面每一个case进行匹配
            如果匹配上了，就会执行对应的语句体，如果此时发现了break，那么结束整个switch语句
            如果没有发现break，那么程序会一直执行下面的case的语句体，直到遇见break或者右大括号为止
            如果多个case的语句体重复了，那么我们考虑利用case穿透简化代码
             */
            case 1:
                System.out.println("number的值是1");
                break;
            case 10:
                System.out.println("number的值是10");
                break;
            case 100:
                System.out.println("number的值是100");
                break;
            default:
                System.out.println("number的值不是1,10或100");
        }
    }
}
