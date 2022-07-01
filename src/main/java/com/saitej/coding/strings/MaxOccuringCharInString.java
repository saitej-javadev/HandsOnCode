package com.saitej.coding.strings;

import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class MaxOccuringCharInString {
    public static void main(String[] args) {
      char ch= maximumOccuringChar("aabbbcccdddeeeeeefffffggggggggg");
        System.out.println("ch = " + ch);
    }


    public static char maximumOccuringChar(String str) {
        return str.chars()
                .mapToObj(x -> (char) x)                  // box to Character
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))  // collect to Map<Character, Long>
                .entrySet().stream()
                .max(comparingByValue())                  // find entry with largest count
                .get()                                    // or throw if source string is empty
                .getKey();
    }













   /* static final int ASCII_SIZE = 256;
    public static void main(String[] args) {
        String str= "Java Programming remember";
        char ch = getMaxOccChar(str);
        System.out.println("Maximum Occuring character:   " + ch);
    }

    private static char getMaxOccChar(String str) {

        int count[] = new int[ASCII_SIZE];

        int len = str.length();
        for (int i = 0; i <len ; i++) {
            count[str.charAt(i)]++;
        }

        int max =-1;
        char result =' ';

        for (int i = 0; i < len; i++) {
            if (max<count[str.charAt(i)]){
                max= count[str.charAt(i)];
                result= str.charAt(i);
            }
        }

      return   result ;

    }*/
}
