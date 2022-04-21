package com.saitej.coding.basic;

public class PalindromeNumber {
    private int r;

    public static void main(String[] args) {
        int n =346;
        int sum=0,r;
        int temp =n;
       while (n>0){
           r= n%10;
           sum =r+sum*10;
           n =n/10;
       }
        System.out.println(sum==temp?"palindrome":"not a palindrome");

    }
}
