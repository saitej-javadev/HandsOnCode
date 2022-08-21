package com.saitej.coding.strings;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str= "programming";
        // Approach: 1

        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(s->sb.append((char)s));
        System.out.println(sb);


    }
}
