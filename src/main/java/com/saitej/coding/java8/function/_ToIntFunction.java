package com.saitej.coding.java8.function;


import java.util.function.ToIntFunction;

public class _ToIntFunction {
    public static void main(String[] args) {
        ToIntFunction<Integer> f = i->i*i;
        System.out.println(f.applyAsInt(5));
    }
}
