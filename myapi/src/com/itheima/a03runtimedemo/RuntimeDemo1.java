package com.itheima.a03runtimedemo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        //获取Runtime对象
        Runtime r1 = Runtime.getRuntime();

        //exit 停止虚拟机
//        r1.exit(0);
//        Runtime.getRuntime().exit(0);

        //获取CPU的线程数
        System.out.println(r1.availableProcessors());//16

        //总内存大小，单位byte字节
        System.out.println(r1.maxMemory() / 1024 / 1024);//3896

        //已经获取的内存大小
        System.out.println(r1.totalMemory() / 1024 / 1024);//244

        //剩余内存大小
        System.out.println(r1.freeMemory() / 1024 / 1024);//239



        //运行cmd命令
        //shutdown：关机
        //加上参数才能执行
        //-s：默认一分钟后关机
        //-s -t 指定时间：指定关机时间
        //-a：取消关机操作
        //-r：关机并重启

        Runtime.getRuntime().exec("shutdown -a ");
    }
}
