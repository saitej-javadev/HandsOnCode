package com.saitej.coding.java8.biconsumer;

import java.util.function.BiConsumer;

public class ConcatStrings {
    public static void main(String[] args) {
        BiConsumer<String ,String> bic = (s, s2) -> System.out.println(s.concat(s2));
        bic.accept("Java","Programming");
    }
}
