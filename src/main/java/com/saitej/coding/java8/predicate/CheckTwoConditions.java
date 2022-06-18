package com.saitej.coding.java8.predicate;

import java.util.function.Predicate;

public class CheckTwoConditions {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10};

        Predicate<Integer> p = o -> o%2==0;  // check even or not
        Predicate<Integer> p1 = integer -> integer<10;
        System.out.println(p.or(p1).test(5));
        System.out.println(p.negate().test(5));// check odd or not // negate is opposite of even

     /*   for (int a:arr) {
            if (p.and(p1).test(a)) {
                System.out.print(a+" ");
            }
        }*/

     //   Arrays.stream(arr).filter(value -> value%2==0).filter(value -> value<8).forEach(System.out::println);
    }
}
