package com.saitej.coding.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class _MapStream {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Consumer<String> c = System.out::println;
        for (int i = 1; i <=5 ; i++) {
            al.add(i);
        }
        System.out.println(al);
        System.out.println(al.stream().map(i->i*10).collect(Collectors.toList()));

        List<String> al2 = Arrays.asList("joe", "bob", "leo");
        System.out.println(al2.stream().map(String::toUpperCase).collect(Collectors.toList()));
        al2.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(c);
    }
}
