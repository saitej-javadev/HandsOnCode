package com.saitej.coding.java8.function;

import java.util.function.Function;

public class AndThenFunction {

    public static void main(String[] args) {

        Function<Integer, Integer> f = i->i+i;
        Function<Integer, Integer> f1 = i->i*i*i;


        //andThen() first evaluates f and then f1
        System.out.println(f.andThen(f1).apply(5));


        //compose() first evaluates f1 and then f
        System.out.println(f.compose(f1).apply(5));
    }
}
