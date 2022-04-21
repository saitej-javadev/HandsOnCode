package com.saitej.coding.arrays;

public class LargestNumInArray {
    public static void main(String[] args) {
        int[] arr = {2,4,33,5,4,7,9999,2};
        int max = arr[0];
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max = " + max);
    }
}
