package com.saitej.coding.strings;

public class RemoveWhitesSpacesInString {
    public static void main(String[] args) {
        String str= "Never ever give up";
        String s = str.replaceAll("\\s", "");
        System.out.println("s = " + s);
    }
}
