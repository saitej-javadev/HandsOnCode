package com.saitej.coding.java8.predicate;

import java.util.function.Predicate;

public class StringPalindrome {

    public static final String string = "madam";
    public static String rev = "";

   /* public static void main(String[] args) {
        reverse(string);
    }

    private static void reverse(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }


        System.out.println(string.equals(rev) ? "Palindrome" : "Not a Palindrome");
    }*/

    //Using Java 8

    public static void main(String[] args) {

        Predicate p = o -> o.equals(new StringBuilder(string).reverse().toString());
        System.out.println(p.test(string) ? "Palindrome" : "Not a Palindrome");
    }


}
