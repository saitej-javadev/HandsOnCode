package com.saitej.coding.java8.supplier;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.function.Supplier;

public class SystemDate {
    public static void main(String[] args) {
        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        System.out.println(s.get());
        Supplier<Date> s1 = Date::new;
        System.out.println(s1.get());
    }
}
