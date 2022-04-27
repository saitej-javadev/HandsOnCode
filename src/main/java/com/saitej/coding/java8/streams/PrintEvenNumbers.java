package com.saitej.coding.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenNumbers {

    public static void main(String[] args) {
        //Without Streams
        List<Integer> al = new ArrayList<>();
        for (int i=1;i<=50;i++){
            al.add(i);
        }
        al.forEach(System.out::println);
        System.out.println();
        System.out.println();
        List<Integer> al2 = new ArrayList<>();// advance for loop shortcut: iter enter
        for (Integer integer : al) {
            if (integer%2==0){
                al2.add(integer);
        }

        }
       System.out.println("Even numbers");
   //     al2.forEach(System.out::println);


        //With Streams

        List<Integer> collect = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);


    }
}
