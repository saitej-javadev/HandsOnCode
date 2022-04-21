package com.saitej.coding.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestNumInArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 33, 5, 4, 777, 9999, 2};
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max = " + max);

        Arrays.sort(arr);
        Arrays.stream(arr).forEach(p -> System.out.println(p + " "));

     //   System.out.println("Second Largest = " + arr[arr.length - 2]);
        int arrLength = arr.length;
        System.out.println("Second Highest    "+arr[arrLength-2]);

        Arrays.stream(arr).forEach(p -> System.out.print(p + " "));
    }
}
