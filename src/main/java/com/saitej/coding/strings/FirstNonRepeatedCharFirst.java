package com.saitej.coding.strings;

public class FirstNonRepeatedCharFirst {
    public static void main(String[] args) {
        String str = "remember";
        char[] chars = str.toCharArray();
        for (char i:chars) {
            if (str.indexOf(i) == str.lastIndexOf(i)){
                System.out.println("First non repeating character: "+ i );
            }
        }

    }
}
