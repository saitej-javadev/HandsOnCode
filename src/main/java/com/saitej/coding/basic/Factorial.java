package com.saitej.coding.basic;

public class Factorial {
    public static void main(String[] args) {

        int result = findFact(5);
        System.out.println("result = " + result);
    }

    private static int findFact(int num) {
        int temp=1;
        for (int i = 1; i <=num ; i++) {
            temp = temp*i;
        }
        return temp;
    }
}
