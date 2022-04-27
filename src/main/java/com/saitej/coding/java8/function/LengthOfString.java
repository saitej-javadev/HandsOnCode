package com.saitej.coding.java8.function;

import java.util.function.Function;

public class LengthOfString {
    public static void main(String[] args) {
        Function<String, Integer> f = s->s.length();
        System.out.println(f.apply("saitej"));
    }
}
