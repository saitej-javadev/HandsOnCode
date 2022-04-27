package com.saitej.coding.java8.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class DisplayContact {

    public static void main(String[] args) {
        List<Contact> al = new ArrayList<>();
        load(al);
        Consumer<Contact> c = o -> System.out.println(o);


        for (Contact contact : al) {
            c.accept(contact);
        }
    }

    private static void load(List<Contact> al) {
        al.addAll(Arrays.asList(
                new Contact("John",new Random()), new Contact("Bob",new Random()), new Contact("Nick",new Random())));
    }
}
