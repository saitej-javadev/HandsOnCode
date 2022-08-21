package com.saitej.coding.basic;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int num=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
         num = sc.nextInt();
        int result=  PerfectNumber.findPerfect(num);

        System.out.println(result==num?"Perfect number":"Not a Perfect Number");
    }

    private static int findPerfect(int num) {
        int sum=0;
        for (int i = 1; i <=num/2 ; i++) {
            if (num%i==0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
