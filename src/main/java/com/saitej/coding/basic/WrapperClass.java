package com.saitej.coding.basic;

public class WrapperClass {

    /* Wrapper class help us to use primitive types as Objects
     In Collections we deal with object so wrapper class helpful in this scenario
     Every primitive type has its own wrapper class
     byte-Byte, short- Short, int-Integer,long -Long,double-Double,char-Character,float-Float,boolean-Boolean
     Converting primitive type to corresponding wrapper class object is Auto-Boxing.
     Converting wrapper class object to corresponding primitive type is call Auto-Unboxing
     It is available from Java 1.5*/


    public static void main(String[] args) {

        //Auto-Boxing

        Integer i = new Integer(10);    //Type:1
        System.out.println(i);

        System.out.println();

        Integer i1 = 20;                      //Type:2
        System.out.println(i1);

        System.out.println();

        Integer i2 = Integer.valueOf("30");   //Type:3
        System.out.println(i2);



        //Auto- UnBoxing

        int i3 = i.intValue();
        System.out.println(13);

        int i4 = i1;
        System.out.println(i4);

    }
}
