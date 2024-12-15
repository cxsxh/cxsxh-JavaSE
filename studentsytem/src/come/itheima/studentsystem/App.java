package come.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1-登录 2-注册 3-忘记密码 4-退出");
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("感谢使用，再见");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    private static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            boolean flag = contains(list, username);
            if (!flag) {
                System.out.println("用户名" + username + "未注册，请先注册再登录");
                return;
            }

            System.out.println("请输入密码");
            String password = sc.next();

            while (true) {
                String rightCode = getCode();
                System.out.println("当前验证码为：" + rightCode);
                System.out.println("验证码为" + rightCode);
                String code = sc.next();
                if (code.equalsIgnoreCase(rightCode)) {
                    System.out.println("验证码正确");
                    break;
                } else {
                    System.out.println("验证码错误");
                    continue;
                }
            }

            User userInfo = new User(username, password, null, null);
            boolean result = checkUserInfo(list, userInfo);
            if (result) {
                System.out.println("登陆成功，可以开始使用学生管理系统了");
                StudentSystem ss = new StudentSystem();
                ss.startStudentSystem();
                break;
            } else if (i == 2) {
                System.out.println("登录失败，用户名或密码错误");

                    System.out.println("账号" + username + "被锁定，请联系客服：XXX-XXXXX");
                    return;

            } else {
                System.out.println("用户名或密码错误,还剩下" + (2 - i) + "次机会");
                continue;
            }
        }

    }

    private static boolean checkUserInfo(ArrayList<User> list, User userInfo) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUsername().equals(userInfo.getUsername()) && user.getPassword().equals(userInfo.getPassword())) {
                return true;
            }
        }

        return false;
    }

    private static void forgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        boolean flag = contains(list, username);
        if (!flag) {
            System.out.println("当前账户" + username + "未注册，请先注册");
            return;
        }

        System.out.println("请输入身份证号码");
        String personID = sc.next();
        System.out.println("请输入手机号");
        String phoneNumber = sc.next();

        int index = findIndex(list, username);
        User user = list.get(index);

        if (!(user.getPersonID().equalsIgnoreCase(personID) && user.getPhoneNumber().equals(phoneNumber))) {
            System.out.println("身份证或手机号有误， 不能修改密码");
        }

        String password;
        while (true) {
            System.out.println("请输入新的密码");
            password = sc.next();
            System.out.println("请确认输入的密码");
            String againPassword = sc.next();
            if (password.equals(againPassword)) {
                System.out.println("两次密码输入一致");
                break;
            } else {
                System.out.println("两次密码不一致请重新输入");
                continue;
            }
        }

        user.setPassword(password);
        System.out.println("密码修改成功");
    }

    private static int findIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUsername().equals(username)) {
                return i;
            }
        }

        return -1;
    }

    private static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String username;
        //用户名
        while (true) {
            System.out.println("请输入用户名");
            username = sc.next();
            boolean flag1 = checkUsername(list, username);

            if (!flag1) {
                System.out.println("用户名不规范，请重新输入");
                continue;
            }

            boolean flag2 = contains(list, username);
            if (flag2) {
                System.out.println("用户名已存在请重新输入");
            } else {
                System.out.println("用户名" + username + "可用");
                break;
            }
        }

        //密码
        String password;
        while (true) {
            System.out.println("请输入要注册的密码");
            password = sc.next();
            System.out.println("请确认要注册的密码");
            String againPassword = sc.next();
            if (!password.equals(againPassword)) {
                System.out.println("两次密码不一致，请重新输入");
                continue;
            } else {
                System.out.println("密码一致，请继续输入其他信息");
                break;
            }
        }

        //身份证号码
        String personID;
        while (true) {
            System.out.println("请输入身份证号码");
            personID = sc.next();
            boolean flag = checkPersonID(personID);
            if (flag) {
                System.out.println("身份证号码满足要求");
                break;
            } else {
                System.out.println("身份证号码不满足要求，请重新输入");
                continue;
            }
        }

        //手机号
        String phoneNumber;
        while (true) {
            System.out.println("请输入手机号码");
            phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if (flag) {
                System.out.println("手机号码正确");
                break;
            } else {
                System.out.println("手机号码有误");
                continue;
            }
        }

        User u = new User(username, password, personID, phoneNumber);
        list.add(u);
        System.out.println("注册成功");

        printList(list);
    }

    private static void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user.getUsername() + "," + user.getPassword() + "," +
                    user.getPersonID() + "," + user.getPhoneNumber());
        }
    }

    private static boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            return false;
        }

        if (phoneNumber.startsWith("0")) {
            return false;
        }

        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }

        return true;
    }

    private static boolean checkPersonID(String personID) {
        if (personID.length() != 18) {
            return false;
        }

        boolean flag = personID.startsWith("0");
        if (flag) {
            return false;
        }

        for (int i = 0; i < personID.length(); i++) {
            char c = personID.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }

        char endChar = personID.charAt(personID.length() - 1);
        if ((endChar >= '0' && endChar <= '9') || (endChar == 'X') || (endChar == 'x')) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean contains(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String rightUsername = user.getUsername();
            if (rightUsername.equals(username)) {
                return true;
            }
        }

        return false;
    }

    private static boolean checkUsername(ArrayList<User> list, String username) {
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }

        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }

        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
            }
        }

        return count > 0;
    }

    private static String getCode() {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }

        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index  = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);
        }

        int number = r.nextInt(10);
        sb.append(number);
        char[] arr = sb.toString().toCharArray();
        int randomIndex = r.nextInt(arr.length);
        char temp =arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        return new String (arr);
    }
}
