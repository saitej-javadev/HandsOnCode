package com.saitej.coding.strings;

public class PrintFirstAndLastChar {
    public static void main(String[] args) {
        String str ="Interstellar";
        int len = str.length();

        System.out.println("First char: " + str.charAt(0));
        System.out.println("Last char: " + str.charAt(len-1));
    }
}
