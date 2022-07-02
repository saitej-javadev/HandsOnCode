package com.saitej.coding.strings;

public class MaxRepeatingChar {

    public static void main(String[] args) {
        String str = "aaaaavvvvvvvvvvvvvvvvvvvccccccccccccccceeee";
        str=str.replaceAll("\\s","");
        int[] arr = new int[256];
        for (int i = 0; i <str.length() ; i++) {
            arr[str.charAt(i)] =arr[str.charAt(i)]+1;
        }

        int max = -1;
            char c= '\u0000';
            for (int j = 0; j <str.length() ; j++) {
                if (max<arr[str.charAt(j)]){
                    max =arr[str.charAt(j)];
                    c= str.charAt(j);
                }
            }
            System.out.println(c);

    }
}
