package com.ithheima.test;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("001", "zhangsan", "123456");
        User u2 = new User("002", "lisi", "12345678");
        User u3 = new User("003", "wangwu", "qwe123456");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        int index = getIndex(list, "001");
        System.out.println(index);
    }

    public static int getIndex( ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            User us1 = list.get(i);
            String uid = us1.getId();
            if (uid.equals(id)) {
                return i;
            }
        }

        return -1;
    }
}
