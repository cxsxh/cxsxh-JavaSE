package com.itheima.twodimensionarr;

public class TwoDimensionDemo3 {
    public static void main(String[] args) {
        int[][] yearArr = {
                {22,66,44},
                {77,33,88},
                {25,65,45},
                {11,66,99}
        };

        int yearSum = 0;

        for (int i = 0; i < yearArr.length; i++) {
            int[] quarterArr = yearArr[i];
            int sum = getSum(quarterArr);
            System.out.println("第" + (i + 1) + "个季度的总营业额为" + sum);
            yearSum = yearSum + sum;
        }
        System.out.println("全年的营业额为" + yearSum);
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
