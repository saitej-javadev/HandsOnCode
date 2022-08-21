package com.saitej.coding.java8.function;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

// If both the input values and return values are same type go for Binary operator (similar to BiFunction<T,T,R>)
public class _BinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<String>
                binaryOperator = (o, o2) -> o.concat(o2);
        System.out.println(binaryOperator.apply("SAITEJA","GALIPELLI"));
        IntBinaryOperator
                intBinaryOperator = (o,o1) -> o*o1;
        System.out.println(intBinaryOperator.applyAsInt(10,20));// for primitives to solve AB and A.UB issues
    }
}
