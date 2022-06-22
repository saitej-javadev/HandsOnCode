package com.saitej.coding.practisetest;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {9, 7, 8, 5, 3, 1, 5, 6, 7, 4, 3, 4, 5, 7, 8, 9, 4, 3, 2, 2, 8};
        int len = arr.length;

        int[] sortedArr= sortArray(arr,len);

        System.out.println("Before removing duplicates...");
        for (int i = 0; i <len ; i++) {
            System.out.print(arr[i]+ ", ");
        }


      int n=  removeDuplicatesInArray(arr,len);
        System.out.println();
        System.out.println("After removing duplicates....");
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+ ", ");
        }
    }

    private static int[] sortArray(int[] arr, int len) {

        for (int i = 0; i <len ; i++) {
            for (int j = 0; j <len ; j++) {
                if (arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }

            }

        }


        return arr;
    }

    private static int removeDuplicatesInArray(int[] arr, int len) {
        int j=0;

        for (int i = 0; i <len-1 ; i++) {
            if (arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++]= arr[len-1];


        return j;
    }
}
