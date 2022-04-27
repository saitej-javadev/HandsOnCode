package com.saitej.coding.java8.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _LocalDate {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("Local Date: "+ now);

        LocalTime now1 = LocalTime.now();
        System.out.println("Local time: " +now1);

        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("LocalDateTime: " +now2);
    }
}
