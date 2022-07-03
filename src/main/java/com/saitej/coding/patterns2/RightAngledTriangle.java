package com.saitej.coding.patterns2;
 /*              *
               * *
             * * *
           * * * *               */
public class RightAngledTriangle {
    public static void main(String[] args) {
        //rows
        for (int i = 1; i <=4 ; i++) {
            //spaces
            for (int j = 3; j >=i ; j--) {
                System.out.print(" ");
            }
            // stars
            for (int k = 1; k <=i ; k++) {
                System.out.print("*");
            }
            // new line
            System.out.println();
        }
    }
}
