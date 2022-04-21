package com.saitej.coding.basic;

public class AddNumInString {
    public static void main(String[] args) {
        String str= "1234@#$43@!45454sajfsd@";
        int sum =0;

        for (int i=0;i<str.length()-1;i++){
            if (Character.isDigit(str.charAt(i))){
                 sum = sum+Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println("sum = " + sum);





    }
}
