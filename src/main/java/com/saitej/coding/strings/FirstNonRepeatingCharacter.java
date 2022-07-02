package com.saitej.coding.strings;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str= "evening";
        char[] chars = str.toCharArray();
        for (char c:chars) {
            if (str.indexOf(c)==str.lastIndexOf(c)){
                System.out.println(c);
            }
        }

    }

    }

