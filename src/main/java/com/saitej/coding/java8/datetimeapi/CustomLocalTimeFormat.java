package com.saitej.coding.java8.datetimeapi;

import java.time.LocalTime;

public class CustomLocalTimeFormat {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        int hour = now.getHour();
        System.out.printf("%d:%d:%d:%d", hour,now.getMinute(),now.getSecond(),now.getNano());
    }
}
