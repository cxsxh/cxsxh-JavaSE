package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        int[] arr = createNumber();

        System.out.println("=================================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("=================================");

        int[] userInputArr = userInputNumber();

        int redCount = 0;
        int blueCount = 0;

        for (int i = 0; i < userInputArr.length - 1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (redNumber == arr[i]) {
                    redCount++;
                    break;
                }
            }
        }

        int blueNumber = userInputArr[userInputArr.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blueCount++;
        }

        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜中奖1000万");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜中奖500万");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜中奖3000");
        } else if (redCount == 5 && blueCount == 0 || redCount == 4 && blueCount == 0) {
            System.out.println("恭喜中奖200");
        } else if (redCount == 4 && blueCount == 1 || redCount == 3 && blueCount == 1) {
            System.out.println("恭喜中奖10");
        } else if (redCount == 2 && blueCount == 1 || redCount == 1 && blueCount == 1  || redCount == 0 && blueCount == 1) {
            System.out.println("恭喜中奖5");
        } else {
            System.out.println("谢谢参与");
        }
    }

    public static int[] userInputNumber() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int redNumber = sc.nextInt();
            if (redNumber >= 1 && redNumber <= 33) {
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("当前号码不存在请重新输入");
                }
            } else {
                System.out.println("当前号码超出范围");
            }
        }

        System.out.println("请输入蓝球号码");
        while (true) {
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("当前蓝球号码超出范围");
            }
        }

        return arr;
    }

    public static int[] createNumber() {
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            }

            int blueNumber = r.nextInt(16) + 1;
            arr[arr.length - 1] = blueNumber;
        }
        return arr;
    }

    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
