package com.saitej.coding.strings;

public class SubString {
    public static void main(String[] args) {
        String str = "SpringBoot";
        System.out.println(str.substring(6));// Boot // remove first six chars and prints remaining string
        System.out.println(str.substring(0,6));// spring // index starts at 0 and excludes the last index of
        System.out.println(str.substring(8));
        System.out.println(str.substring(3,6));
    }

}
