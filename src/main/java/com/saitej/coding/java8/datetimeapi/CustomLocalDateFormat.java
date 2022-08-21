package com.saitej.coding.java8.datetimeapi;

import java.time.LocalDate;

class CustomLocalDateFormat {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        int dayOfMonth = now.getDayOfMonth();

        int monthValue = now.getMonthValue();

        int year = now.getYear();

        System.out.printf("%d-%d-%d", dayOfMonth, monthValue, year);
    }
}
