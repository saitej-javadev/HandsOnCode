package com.saitej.coding.strings;

public class CountNoOfWordsInString {
    public static void main(String[] args) {
        String words = "Eye of a tiger";
        int length = words.split(" ").length;
        System.out.println("length = " + length);
    }
}
