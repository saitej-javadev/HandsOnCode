package com.saitej.coding.strings;

public class StringLengthWithoutMethod {
    public static void main(String[] args) {
        String str = "Interstellar";
      //  System.out.println(str.length());
        int len = 0;
        char[] chars = str.toCharArray();
        for (char c:chars) {
            len++;
        }
        System.out.println(len);

    }
}
