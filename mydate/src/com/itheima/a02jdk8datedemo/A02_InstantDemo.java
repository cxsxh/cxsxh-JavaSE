package com.itheima.a02jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A02_InstantDemo {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);

        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Aden"));
        System.out.println(zonedDateTime);

        Instant instant3 = Instant.now().minusMillis(10L);
        System.out.println(instant3);

        Instant instant4 = Instant.now().plusMillis(10L);
        System.out.println(instant4);
    }
}
