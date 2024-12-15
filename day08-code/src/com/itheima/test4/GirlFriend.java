package com.itheima.test4;

public class GirlFriend {
    private int age;

    public void method() {
        int age = 10;
        System.out.println(age);//就近原则，谁离得近就用谁
        System.out.println(this.age);
    }
}
