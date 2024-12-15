package com.itheima.test1;

public class RoleTest {
    public static void main(String[] args) {
        Role r1 = new Role("超梦", 100);
        Role r2 = new Role("烈空座", 100);

        while (true) {
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "打败了" + r2.getName());
                break;
            }

            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "打败了" + r1.getName());
                break;
            }
        }
    }
}
