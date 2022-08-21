package com.saitej.coding.java8.predicate;

import java.util.function.IntPredicate;

// use IntPredicate for primitive types
public class _IntPredicate {
    public static void main(String[] args) {
        IntPredicate p = i -> i%2==0;
        int[] arr = {2,3,4,5,6,7,8,9,10};
        for (int x:arr){
            if (p.test(x)){
                System.out.println(x);
            }
        }
    }
}
