package com.saitej.coding.practisetest;

public class AscAndDescOrder {
    public static void main(String[] args) {
        int[] arr = {9, 7, 8, 5, 3, 1, 5, 6, 7, 4, 3, 4, 5, 7, 8, 9, 4, 3, 2, 2, 8};

        int len = arr.length;

        int[] soredArrAsc = sortArrayInAsc(arr, len);
        System.out.println("After sorting in ascending...");
        for (int i : soredArrAsc) {
            System.out.print(i + ", ");
        }
        System.out.println();
        int[] soredArrDesc = sortArrayInDesc(arr, len);
        System.out.println("After sorting in decending...");
        for (int i : soredArrDesc) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    private static int[] sortArrayInDesc(int[] arr, int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }


    private static int[] sortArrayInAsc(int[] arr, int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;
    }
}
