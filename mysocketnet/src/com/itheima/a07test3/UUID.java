package com.itheima.a07test3;

public class UUID {
    public static void main(String[] args) {
        java.util.UUID uuid = java.util.UUID.randomUUID();
        String id = uuid.toString().replace("-", "");
        System.out.println(id);
    }
}
