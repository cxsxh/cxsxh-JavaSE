package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //定义一个数组组,储存6个分数
        int[] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
        //求出最大值
        int max = getMax(scoreArr);
        //求出最小值
        int min = getMin(scoreArr);
        //求出分数总和
        int sum = getSum(scoreArr);
        //(总和 - 最大值 - 最小值) / 4
        int vag = (sum - max - min) / (scoreArr.length - 2);
        System.out.println("选手的最终得分" + vag);
    }

    //求和
    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;
    }

    //求数组最大值
    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    //求最小值
    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] < min) {
                min = scoreArr[i];
            }
        }
        return min;
    }

    //取6个分数
    public static int[] getScores() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("输入评委打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("成绩超出了范围,继续录入,当前 i 为" + i);
            }
        }
        return scores;
    }
}
