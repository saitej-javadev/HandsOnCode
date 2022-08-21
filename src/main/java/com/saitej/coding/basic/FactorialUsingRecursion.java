package com.saitej.coding.basic;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int num=5;
        int fact=FactorialUsingRecursion.findFactorial(num);
        System.out.println("fact = " + fact);
    }
    private static int findFactorial(int num) {
        if (num>=1){
            return num*findFactorial(num-1);
        } else
            return 1;
    }
}
