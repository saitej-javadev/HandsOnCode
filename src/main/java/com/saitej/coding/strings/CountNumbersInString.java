package com.saitej.coding.strings;

public class CountNumbersInString {
    public static void main(String[] args) {

        String str= "4343!@!#!3434#$$$@313!3";
        int sum = addNosInString(str);
        System.out.println("sum = " + sum);
    }

    private static int addNosInString(String str) {
        int sum=0;
        for (int i = 0; i <str.length()-1 ; i++) {
            if (Character.isDigit(str.charAt(i))){
                sum= sum+Character.getNumericValue(str.charAt(i));
            }
            
        }
        return sum;
    }
}
