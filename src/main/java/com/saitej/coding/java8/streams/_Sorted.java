package com.saitej.coding.java8.streams;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class _Sorted {
    public static void main(String[] args) {
        Set<Integer> al = new HashSet<>();
        for (int i = 1; i <=20 ; i++) {
            al.add(i);
        }
       // System.out.println(al);
        System.out.println(al.stream().sorted().collect(Collectors.toList()));
        System.out.println(al.stream().sorted((o1, o2) -> o1>o2?-1:o1<o2?1:0).collect(Collectors.toList()));
        System.out.println(al.stream().sorted((o1, o2) -> o1<o2?-1:o1>o2?1:0).collect(Collectors.toList()));
        System.out.println(al.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList()));
        System.out.println(al.stream().sorted((o1, o2) -> -o1.compareTo(o2)).collect(Collectors.toList()));

    }
}
