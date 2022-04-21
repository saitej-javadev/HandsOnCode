package com.saitej.coding.basic;

public class ReplaceVowels {
    public static void main(String[] args) {
         removeVowels("Eye of the tiger");
    //    System.out.println(new String("Never give up").replaceAll("[aeiou]", ""));
    }

    private static void removeVowels(String str) {
        String s = str.replaceAll("[aeiou]", "");
        System.out.println("s = " + s);

    }
}
