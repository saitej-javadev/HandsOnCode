package com.saitej.coding.strings;

public class RemoveDuplicatesInString {
    static String res="";
    public static void main(String[] args) {
        String str = "Programming";
        str.chars().distinct().forEach(s->res=res+(char)s);
        System.out.println(res);

    }
}
