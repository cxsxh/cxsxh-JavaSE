package com.itheima.test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        GirlFriend gl1 = new GirlFriend("xa", 19, 162);
        GirlFriend gl2 = new GirlFriend("xx", 18, 160);
        GirlFriend gl3 = new GirlFriend("xy", 17, 158);

        GirlFriend[] girlFriends = {gl1, gl2, gl3};

        Arrays.sort(girlFriends, (o1, o2) -> {
            double temp = o1.getAge() - o2.getAge();
            temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

            if (temp > 0) {
                return 1;
            } else if (temp < 0) {
                return -1;
            } else {
                return 0;
            }
        });

        System.out.println(Arrays.toString(girlFriends));
    }
}
