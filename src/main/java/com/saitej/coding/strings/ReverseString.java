package com.saitej.coding.strings;

public class ReverseString {
    public static void main(String[] args) {
        String name = "James Gosling";
        String rev = "";
        for (int i = name.length()-1; i >=0 ; i--) {
            rev = rev+ name.charAt(i);
        }
        System.out.println("rev = " + rev);
    }
}
