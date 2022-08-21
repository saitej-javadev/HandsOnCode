package com.saitej.coding.practisetest;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {9,7,8,5,3,1,5,6,7,4,3,4,5,7,8,9,4,3,2,2};
      //  int max = arr[0];
        int min = arr[0];
        int len = arr.length-1;

       /* for (int i = 0; i <len ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("Max: " +max);*/


        for (int i = 0; i <len ; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Min: " + min);
    }
}
