package com.saitej.coding.basic;

import java.util.Arrays;

public class RemoveDuplicatesInArray {
    public static void main(String[] args) {
        int [] arr = {2,3,4,2,3,4,5,9,8,9};
      /*  Arrays.sort(arr);

        int n = arr.length-1;
        int j=0;
        for (int i=0;i<n;i++){
            if (arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++] = arr[n];
        for (int i=0;i<j;i++){
            System.out.print(arr[i] + " ");
        }*/

      Arrays.stream(arr).distinct().forEach(value -> System.out.print(value+" "));
    }
}
