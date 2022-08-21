package com.saitej.coding.strings;

public class AddNumbersInString {
    public static void main(String[] args) {
        String pattern = "#23$%*&234232SDSD";
        int sum =0;
        for (int i = 0; i <pattern.length() ; i++) {
            if (Character.isDigit(pattern.charAt(i))){
                sum= sum+Character.getNumericValue(pattern.charAt(i));
            }
        }
        System.out.println("sum = " + sum);
    }
}
