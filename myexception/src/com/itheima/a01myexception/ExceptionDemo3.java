package com.itheima.a01myexception;

import java.util.Scanner;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GirFriend gl = new GirFriend();

        while (true) {
            try {
                System.out.println("输入名字");
                String s1 = sc.nextLine();
                gl.setName(s1);

                System.out.println("输入年龄");
                String s2 = sc.nextLine();
                int i = Integer.parseInt(s2);
                gl.setAge(i);
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄格式有误");
            } catch (Name e) {
                System.out.println("姓名格式有误");
            } catch (RuntimeException e) {
                System.out.println("格式有误");
            }
        }

        System.out.println("录入成功");
    }
}
