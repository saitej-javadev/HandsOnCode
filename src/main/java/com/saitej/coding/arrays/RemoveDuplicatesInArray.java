package com.saitej.coding.arrays;

import java.util.Arrays;

public class RemoveDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr= {32,46,32,54,78,32,98,12,12};
        Arrays.sort(arr);
        int j=0;
        int n = arr.length-1;
        for (int i=0;i<n;i++){
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[n];
        for (int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
       // Arrays.stream(arr).distinct().forEach(System.out::println);
    }

}
