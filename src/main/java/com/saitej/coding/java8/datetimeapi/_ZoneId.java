package com.saitej.coding.java8.datetimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class _ZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        System.out.println(zoneId);

        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime now = ZonedDateTime.now(la);
        System.out.println(now);
    }
}