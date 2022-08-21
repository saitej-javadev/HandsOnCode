package com.saitej.coding.java8.predicate;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Check given list is empty or not
public class CheckListEmptyOrNot {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("saiteja", "saikrishna", "srikanth");
        Predicate<List<String>> p = strings1 -> strings1.isEmpty();
        System.out.println(p.test(strings));
    }
}
