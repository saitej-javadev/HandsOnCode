package com.saitej.coding.java8.bifunction;

import java.util.function.BiFunction;


public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        BiFunction<Integer, Integer,Integer> bif = (a, b) -> a*b;
        System.out.println(bif.apply(2,3));
    }
}
