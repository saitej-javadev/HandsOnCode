package com.saitej.coding.arrays;

public class SecondHighetswihoutSorting {
    public static void main(String[] args) {
        int[] arr = {7,8,4,1,0,10,33,23,54,1,2,5,6};
        int largest =0;
        int secondLargest=0;
        for (int i:arr) {
            System.out.print(i+" ");
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>largest) {
                secondLargest = largest;
                largest = arr[i];
            }else if (arr[i]>secondLargest){
                secondLargest =arr[i];
            }
        }
        System.out.println("\nSecond Largest: " + secondLargest);
    }
}
