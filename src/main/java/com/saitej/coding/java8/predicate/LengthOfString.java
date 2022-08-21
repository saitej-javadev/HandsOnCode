package com.saitej.coding.java8.predicate;

import java.util.function.Predicate;
// To check the length of the String greater than 5 or not.
public class LengthOfString {

    public static void main(String[] args) {
        Predicate<String> p = s -> s.length()>5;
        System.out.println(p.test("Spring"));
    }
}
