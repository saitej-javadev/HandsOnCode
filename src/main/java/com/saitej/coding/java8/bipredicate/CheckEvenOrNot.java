package com.saitej.coding.java8.bipredicate;

import java.util.function.BiPredicate;

// check sum of two numbers is even or not
public class CheckEvenOrNot {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bi = (a, b) -> (a + b) % 2 == 0;
        System.out.println(bi.test(2,4));
        System.out.println(bi.test(3,6));
    }


}
