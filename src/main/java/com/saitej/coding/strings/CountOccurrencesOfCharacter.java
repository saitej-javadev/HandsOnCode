package com.saitej.coding.strings;

public class CountOccurrencesOfCharacter {
    public static void main(String[] args) {
        String str = "eye of a tiger";
        char search ='e';


        long count = str.chars().filter(value -> value == search).count();
        System.out.println("count = " + count);

    }
}
