package com.saitej.coding.basic;

//By using Integer.valueOf() method we will get Integer Object and this method can be used both on String and int.
// By using Integer.parseInt() method we will get primitive int value and this method can be used only on String

public class StringToInt {

    public static void main(String[] args) {

        String s  ="10";

        int i = Integer.valueOf(s);
        System.out.println(i);

        int i1 = Integer.parseInt(s);
        System.out.println(i1);




        //Int to String conversion
        System.out.println();
        int i3 =20;
        String str = String.valueOf(i3);
        System.out.println(i3);

        String s1 = Integer.toString(i3);
        System.out.println(s1);


    }
}
