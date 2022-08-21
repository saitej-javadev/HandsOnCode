package com.saitej.coding.strings;

public class RemoveSpacesInString {
    public static void main(String[] args) {
        String str= "The time is always right to do what is right.";
        String s=str.replaceAll("\\s","");
        System.out.println(s);

    }
}
