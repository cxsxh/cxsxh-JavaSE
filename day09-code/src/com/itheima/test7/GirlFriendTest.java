package com.itheima.test7;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4];

        GirlFriend g1 = new GirlFriend("小诗诗", 18, "萌妹子", "吃零食");
        GirlFriend g2 = new GirlFriend("小欣欣", 19, "萌妹子", "睡觉");
        GirlFriend g3 = new GirlFriend("小乐乐", 20, "萌妹子", "玩游戏");
        GirlFriend g4 = new GirlFriend("小爱爱", 21, "萌妹子", "运动");

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend girlFriends = arr[i];
            sum = sum + girlFriends.getAge();
        }

        int vag = sum / arr.length;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf =arr[i];
            if (gf.getAge() < vag) {
                System.out.println(gf.getName() + "," + gf.getAge() + "," + gf.getGender() + "," + gf.getHobby());
                count ++;
            }
        }

        System.out.println(count + "个");
    }
}
