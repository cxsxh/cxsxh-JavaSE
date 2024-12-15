package com.itheima.a01mathdemo1;

public class MathDemo1 {
    public static void main(String[] args) {
        //abs 获取绝对值
        System.out.println(Math.abs(88)); //88
        System.out.println(Math.abs(-88)); //88

        //bug：
        //int类型取值范围：-2147483648 ~ 2147483647

        System.out.println("---------------------------");

        //进一法，往数轴的正前方进一
        System.out.println(Math.ceil(12.34));//13.0
        System.out.println(Math.ceil(12.54));//13.0
        System.out.println(Math.ceil(-12.34));//12.0
        System.out.println(Math.ceil(-12.54));//12.0

        System.out.println("---------------------------");

        //去尾法
        System.out.println(Math.floor(12.34));//12.0
        System.out.println(Math.floor(12.54));//12.0
        System.out.println(Math.floor(-12.34));//13.0
        System.out.println(Math.floor(-12.54));//13.0

        System.out.println("---------------------------");

        //四舍五入
        System.out.println(Math.round(12.34));//12
        System.out.println(Math.round(12.54));//13
        System.out.println(Math.round(-12.34));//-12
        System.out.println(Math.round(-12.54));//-13

        System.out.println("---------------------------");

        //获取两个整数的较大值
        System.out.println(Math.max(20, 30));//30
        //获取两个整数的较小值
        System.out.println(Math.min(20, 30));//20


        System.out.println("---------------------------");

        //获取a的b次幂
        System.out.println(Math.pow(2, 3));//8
        //细节：
        //如果第二个参数 0 ~ 1之间的小数
        System.out.println(Math.pow(4, 0.5));//2.0
        System.out.println(Math.pow(2, -2));//0.25
        //建议：
        //第二个参数：一般传递大于1的正整数。

        //开平方
        System.out.println(Math.sqrt(4));//2.0
        //开立方
        System.out.println(Math.cbrt(8));//2.0

        System.out.println("---------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(Math.floor(Math.random() * 100 + 1));
        }

    }
}
