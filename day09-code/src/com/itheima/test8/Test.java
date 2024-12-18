package com.itheima.test8;

public class Test {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3, "wangwu", 25);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        Student stu4 = new Student(4, "zhaoliu", 26);

        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            System.out.println("当前id重复，请重试");
        } else {
            int count = getCount(arr);
            if (count == arr.length) {
                Student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;

                printArr(newArr);
            } else {
                arr[count] = stu4;

                printArr(arr);
            }
        }
    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
            }
        }
    }

    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {

            Student stu = arr[i];

            if (stu != null) {
                int sid = stu.getId();

                if (sid == id) {
                    return true;
                }
            }

        }
        return false;
    }
}
