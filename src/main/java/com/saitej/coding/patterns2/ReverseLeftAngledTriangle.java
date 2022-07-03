package com.saitej.coding.patterns2;
/*
        * * * *
        * * *
        * *
        *
*/


public class ReverseLeftAngledTriangle {
    public static void main(String[] args) {
        //rows
        for (int i = 1; i <=4 ; i++) {
            //stars
            for (int j = 4; j >=i ; j--) {
                System.out.print("* ");
            }
            // new line
            System.out.println();
        }
    }
}
