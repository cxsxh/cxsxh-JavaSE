package com.itheima.Switchdemo;

public class SwitchDemo2 {
    public static void main(String[] args) {
        int number = 1;
        switch (number){
            //default不一定非要写在最下面,可以写任意位置,但是习惯性写最下面。
            //default可以省略,语法不会有问题,但是不建议省略。
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
