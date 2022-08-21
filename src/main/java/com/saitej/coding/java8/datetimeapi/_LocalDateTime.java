package com.saitej.coding.java8.datetimeapi;

import java.time.LocalDateTime;
import java.time.Month;

public class _LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);

        LocalDateTime.of(1994, Month.APRIL,8,10,58,58);

        System.out.println(now.plusMonths(6));

    }
}
