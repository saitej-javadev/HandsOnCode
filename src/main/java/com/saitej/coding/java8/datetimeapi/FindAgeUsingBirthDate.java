package com.saitej.coding.java8.datetimeapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class FindAgeUsingBirthDate {

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1994, Month.APRIL, 8);
        LocalDate now = LocalDate.now();
        System.out.println("Age: " + Period.between(birthDate, now));
    }

}
