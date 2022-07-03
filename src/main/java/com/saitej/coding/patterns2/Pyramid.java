package com.saitej.coding.patterns2;

public class Pyramid {
    public static void main(String[] args) {
        //rows
        for (int i = 1; i <=4 ; i++) {
            //spaces
            for (int j = 1; j <=5-i ; j++) {
                System.out.print(" ");
            }
            //stars
            for (int k = 1; k <=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
