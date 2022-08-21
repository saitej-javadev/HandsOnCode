package com.saitej.coding.patterns2;
/*      *
        * *
        * * *
        * * * *              */

public class LeftAngledTriangle {
    public static void main(String[] args) {
        //rows
        for (int i = 1; i <=4 ; i++) {
            //stars
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            // newline
            System.out.println();
        }
    }
}
