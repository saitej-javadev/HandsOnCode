package com.saitej.coding.practisetest;

public class SecondHighest {
    public static void main(String[] args) {
        int[] arr = {9, 7, 8, 5, 3, 1, 5, 6, 7, 4, 3, 4, 5, 7, 8, 9, 4, 3, 2, 21, 18};
        int len = arr.length;

        int[] sortedArr=sortArray(arr,len);
        System.out.println("After sorting: ");
        for (int i = 0; i <len ; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Second Highest num: " + arr[sortedArr.length-2]);

    }

    private static int[] sortArray(int[] arr, int len) {
        for (int i = 0; i <len ; i++) {
            for (int j = 0; j <len ; j++) {
                if (arr[i]<arr[j]){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }

            }

        }
        return arr;
    }
}
