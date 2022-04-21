package com.saitej.coding.basic;


public class CountCharsInString {

    public static void main(String[] args) {
        String str= "aaaaaaAAAAABBBBBBccccccDDDDDDDDDDDDD";
        char search = 'A';
       /* long count = str.chars().filter(value -> value == search).count();
        System.out.println(search+" count = " + count);*/
       int count =0;
       for(int i=0;i<str.length();i++){
           if(search==str.charAt(i)){
               count++;
           }
       }
        System.out.println("count = " + count);
       
    }
}
